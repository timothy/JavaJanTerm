/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr2_6;
import java.awt.EventQueue;
import java.awt.GridLayout;
import javax.swing.*;
/**
 *
 * @author tbradford16
 */
public class EditPopUp {
    private static HomeworkTracker _ht;
    
    public static void setHomeworkTracker(HomeworkTracker ht) {
        _ht = ht;
    }
    public static void display(String[] tim) {
        //String[] tim = _ht.getStudent();
        JComboBox combo = new JComboBox(tim);
        JTextField courseText = new JTextField("CS171");
        JTextField gradeText = new JTextField("4.0");
        JPanel panel = new JPanel(new GridLayout(0, 1));
        panel.add(combo);
        panel.add(new JLabel("Course Name"));
        panel.add(courseText);
        panel.add(new JLabel("Grade"));
        panel.add(gradeText);
        int result = JOptionPane.showConfirmDialog(null, panel, "Add Grade",
            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (result == JOptionPane.OK_OPTION) {
            _ht.setGrade(combo.getName(), courseText.getText(), Double.parseDouble(gradeText.getText()));
        } else {
            System.out.println("Cancelled");
        }
    }
}
