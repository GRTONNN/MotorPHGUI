import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MilestoneCalculator extends JFrame {
    
    private JLabel milestone1Label, milestone2Label, terminalAssessmentLabel, totalGradeLabel;
    private JTextField milestone1TextField, milestone2TextField, terminalAssessmentTextField, totalGradeTextField;
    private JButton calculateButton;
    
    public MilestoneCalculator() {
        setTitle("Milestone Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(5, 2));
        
        // Initialize labels and text fields
        milestone1Label = new JLabel("Milestone 1 (25%): ");
        milestone1TextField = new JTextField();
        milestone2Label = new JLabel("Milestone 2 (40%): ");
        milestone2TextField = new JTextField();
        terminalAssessmentLabel = new JLabel("Terminal Assessment (35%): ");
        terminalAssessmentTextField = new JTextField();
        totalGradeLabel = new JLabel("Total Grade: ");
        totalGradeTextField = new JTextField();
        totalGradeTextField.setEditable(false);
        
        // Initialize calculate button
        calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculateTotalGrade();
            }
        });
        
        // Add components to frame
        add(milestone1Label);
        add(milestone1TextField);
        add(milestone2Label);
        add(milestone2TextField);
        add(terminalAssessmentLabel);
        add(terminalAssessmentTextField);
        add(totalGradeLabel);
        add(totalGradeTextField);
        add(new JLabel()); // Empty label for spacing
        add(calculateButton);
        
        setVisible(true);
    }
    
    // Calculate the total grade and display it in the total grade text field
    private void calculateTotalGrade() {
        try {
            double milestone1Grade = Double.parseDouble(milestone1TextField.getText());
            double milestone2Grade = Double.parseDouble(milestone2TextField.getText());
            double terminalAssessmentGrade = Double.parseDouble(terminalAssessmentTextField.getText());
            
            if (milestone1Grade < 0 || milestone1Grade > 25) {
                throw new IllegalArgumentException("Milestone 1 grade should be between 0 and 25");
            }
            if (milestone2Grade < 0 || milestone2Grade > 40) {
                throw new IllegalArgumentException("Milestone 2 grade should be between 0 and 40");
            }
            if (terminalAssessmentGrade < 0 || terminalAssessmentGrade > 35) {
                throw new IllegalArgumentException("Terminal Assessment grade should be between 0 and 35");
            }
            
            double totalGrade = milestone1Grade * 0.25 + milestone2Grade * 0.4 + terminalAssessmentGrade * 0.35;
            totalGradeTextField.setText(String.format("%.2f", totalGrade));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid grade", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void main(String[] args) {
        new MilestoneCalculator();
    }
}
