/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabledrop;

import java.awt.Cursor;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.dnd.DragSource;
import java.util.ArrayList;
import java.util.Vector;
import javax.activation.ActivationDataFlavor;
import javax.activation.DataHandler;
import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.TransferHandler;
import static javax.swing.TransferHandler.MOVE;
import javax.swing.table.DefaultTableModel;

class TableRowTransferHandler extends TransferHandler {

    private int[] rows = null;
    private int addIndex = -1; //Location where items were added
    private int addCount = 0;  //Number of items added.
    private final DataFlavor localObjectFlavor;
    private Object[] transferedObjects = null;
    private JComponent source = null;

    public TableRowTransferHandler() {
        localObjectFlavor = new ActivationDataFlavor(
                Object[].class, DataFlavor.javaJVMLocalObjectMimeType, "Array of items");
    }

    @Override
    protected Transferable createTransferable(JComponent c) {
        source = c;
        JTable table = (JTable) c;
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        ArrayList< Object> list = new ArrayList< Object>();
        for (int i : rows = table.getSelectedRows()) {
            list.add(model.getDataVector().elementAt(i));
        }
        transferedObjects = list.toArray();
        return new DataHandler(transferedObjects, localObjectFlavor.getMimeType());
    }

    @Override
    public boolean canImport(TransferHandler.TransferSupport info) {
        JTable t = (JTable) info.getComponent();
        boolean b = info.isDrop() && info.isDataFlavorSupported(localObjectFlavor);
        //XXX bug?
        t.setCursor(b ? DragSource.DefaultMoveDrop : DragSource.DefaultMoveNoDrop);
        return b;
    }

    @Override
    public int getSourceActions(JComponent c) {
        return TransferHandler.COPY_OR_MOVE;
    }

    @Override
    public boolean importData(TransferHandler.TransferSupport info) {
        JTable target = (JTable) info.getComponent();
        JTable.DropLocation dl = (JTable.DropLocation) info.getDropLocation();
        DefaultTableModel model = (DefaultTableModel) target.getModel();
        int index = dl.getRow();
        int max = model.getRowCount();
        if (index < 0 || index > max) {
            index = max;
        }
        addIndex = index;
        target.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        try {
            Object[] values
                    = (Object[]) info.getTransferable().getTransferData(localObjectFlavor);
            if (source == target) {
                addCount = values.length;
            }
            for (int i = 0; i < values.length; i++) {
                int idx = index++;
                model.insertRow(idx, (Vector) values[i]);
                target.getSelectionModel().addSelectionInterval(idx, idx);
            }
            return true;
        } catch (Exception ufe) {
            ufe.printStackTrace();
        }
        return false;
    }

    @Override
    protected void exportDone(JComponent c, Transferable t, int act) {
        cleanup(c, act == MOVE);
    }

    private void cleanup(JComponent src, boolean remove) {
        if (remove && rows != null) {
            JTable table = (JTable) src;
            src.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            if (addCount > 0) {
                for (int i = 0; i < rows.length; i++) {
                    if (rows[i] >= addIndex) {
                        rows[i] += addCount;
                    }
                }
            }
            for (int i = rows.length - 1; i >= 0; i--) {
                model.removeRow(rows[i]);
            }
        }
        rows = null;
        addCount = 0;
        addIndex = -1;
    }
}
