/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr3_3;

import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tbradford16
 */
public class Calendars extends javax.swing.JFrame {

    /**
     * Creates new form Calendar
     */
    // private Calendar cal = Calendar.getInstance();
    private ArrayList<Event> list = new ArrayList<Event>();

    private ReadWrite RW = new ReadWrite("CalendarSave");
    final static String DATE_FORMAT = "dd-MM-yyyy";
    private DateFormat df;
    private Pattern p = Pattern.compile("name:->(.*?)exit@N");
/**
 * @see constructer
 */
    public Calendars() {
        initComponents();
        df = new SimpleDateFormat(this.DATE_FORMAT);
        Table.setAutoCreateRowSorter(true);
        upDate();
    }

    /**
     * @param this takes a KeyEvent and will only allow a KeyEvents that are a
     * digit, Backspace, or delete key
     */
    void intOnly(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE)) {
            getToolkit().beep();
            evt.consume();
        }
    }

    /**
     *
     * @param d is the day of the month
     * @param m is the month expressed as a number
     * @param y year
     * @return returns true if the d + m + y make a valid date format
     */
    public Boolean checkDate(String d, String m, String y) {
        try {
            df.setLenient(false);
            df.parse(d + "-" + m + "-" + y);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    /**
     * @see upDate will up date the table to show all current events stored on
     * the text file. it will add new rows to the table as needed
     */
    public void upDate() {
        ArrayList<String> na = new ArrayList<>();
        ArrayList<String> lo = new ArrayList<>();
        ArrayList<String> da = new ArrayList<>();
        ArrayList<String> mo = new ArrayList<>();
        ArrayList<String> yr = new ArrayList<>();
        //new table madel for adding new rows into Table
        DefaultTableModel model = (DefaultTableModel) Table.getModel();
        for (int r = 0; r < model.getRowCount(); r++) {
            model.removeRow(r);
        }
        //model.addRow(new Object[]{"Column 1", "Column 2", "Column 3"});
        Matcher m = p.matcher(RW.read());
        //adds name first
        while (m.find()) {
            na.add(m.group(1));
            // Table.getModel().setValueAt(m.group(1), 0, 0);
        }
        // adds Location second
        p = Pattern.compile("Loc:->(.*?)exit@L");
        m = p.matcher(RW.read());

        while (m.find()) {
            lo.add(m.group(1));
            //Table.getModel().setValueAt(m.group(1), 0, 1);
        }
        // adds Month third
        p = Pattern.compile("M:->(.*?)exit@M");
        m = p.matcher(RW.read());

        while (m.find()) {
            mo.add(m.group(1));
            // Table.getModel().setValueAt(m.group(1), 0, 2);
        }
        // adds Day forth
        p = Pattern.compile("D:->(.*?)exit@D");
        m = p.matcher(RW.read());

        while (m.find()) {
            da.add(m.group(1));
            // Table.getModel().setValueAt(m.group(1), 0, 3);
        }
        // adds Year fith
        p = Pattern.compile("Y:->(.*?)exit@Y");
        m = p.matcher(RW.read());

        while (m.find()) {
            yr.add(m.group(1));
            // Table.getModel().setValueAt(m.group(1), 0, 4);
        }
        p = Pattern.compile("name:->(.*?)exit@N");
        for (int i = 0; i < na.size() && i < lo.size() && i < mo.size() && i < da.size() && i < yr.size(); i++) {

            model.addRow(new Object[]{na.get(i), lo.get(i), mo.get(i), da.get(i), yr.get(i)});
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        addevent = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        N_TF = new javax.swing.JTextField();
        L_TF = new javax.swing.JTextField();
        M_TF = new javax.swing.JTextField();
        D_TF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Y_TF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        label1.setText("Event Calendar");

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Event Name", "Event Location", "Month", "Date", "Year"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Table);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(186, 186, 186))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Calendar Info", jPanel1);

        addevent.setFont(new java.awt.Font("Vani", 1, 18)); // NOI18N
        addevent.setText("Add Event");
        addevent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addeventActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Yu Mincho", 1, 14)); // NOI18N
        jLabel1.setText("Name of Event");

        jLabel2.setFont(new java.awt.Font("Yu Mincho", 1, 14)); // NOI18N
        jLabel2.setText("Location of Event");

        jLabel3.setFont(new java.awt.Font("Yu Mincho", 1, 14)); // NOI18N
        jLabel3.setText("Month of Event");

        N_TF.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N

        L_TF.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N

        M_TF.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        M_TF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                M_TFKeyTyped(evt);
            }
        });

        D_TF.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        D_TF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                D_TFKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Yu Mincho", 1, 14)); // NOI18N
        jLabel4.setText("Day of Event");

        Y_TF.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        Y_TF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Y_TFKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Yu Mincho", 1, 14)); // NOI18N
        jLabel5.setText("Year of Event");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addevent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(L_TF)
                            .addComponent(N_TF)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(M_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5)
                                        .addGap(35, 35, 35))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(D_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                        .addComponent(Y_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(19, 19, 19))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addComponent(jLabel2))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(167, 167, 167)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(N_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(3, 3, 3)
                .addComponent(L_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(M_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Y_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addevent, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Add Event", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Calendar Info");

        pack();
    }// </editor-fold>//GEN-END:initComponents
     // if checkDate returns true than it will add the text box info to list of events
    //after ading it to the list of events it will write each event in the list to the text file
    // if an invalid date is entered than a text box is shown
    private void addeventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addeventActionPerformed

        if (checkDate(D_TF.getText(), M_TF.getText(), Y_TF.getText())) {

//            list.add(new Event(N_TF.getText(), L_TF.getText(), M_TF.getText(),
//                    D_TF.getText(), Y_TF.getText()));
            RW.write(new Event(N_TF.getText(), L_TF.getText(), M_TF.getText(),
                    D_TF.getText(), Y_TF.getText()));

//            list.stream().forEach((i) -> {
//                RW.write(i);
//            });//N_TF.setText(RW.read());
        } else {
            RW.popup("Please enter a valid date");
        }
        upDate();
    }//GEN-LAST:event_addeventActionPerformed
    /**
     *
     * @param evt is what the user tries to put in the text box. when passed to
     * intOnly() only integers are aloud to be put into the text box
     */
    private void M_TFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_M_TFKeyTyped
        intOnly(evt);
    }//GEN-LAST:event_M_TFKeyTyped
    /**
     *
     * @param evt is what the user tries to put in the text box. when passed to
     * intOnly() only integers are aloud to be put into the text box
     */
    private void D_TFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_D_TFKeyTyped
        intOnly(evt);
    }//GEN-LAST:event_D_TFKeyTyped
    /**
     *
     * @param evt is what the user tries to put in the text box. when passed to
     * intOnly() only integers are aloud to be put into the text box
     */
    private void Y_TFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Y_TFKeyTyped
        intOnly(evt);
    }//GEN-LAST:event_Y_TFKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calendar.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calendar.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calendar.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calendar.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calendars().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField D_TF;
    private javax.swing.JTextField L_TF;
    private javax.swing.JTextField M_TF;
    private javax.swing.JTextField N_TF;
    private javax.swing.JTable Table;
    private javax.swing.JTextField Y_TF;
    private javax.swing.JButton addevent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}
