package crit_thinking_2;

import java.awt.event.ActionEvent;
import javax.swing.*;

public class UserInterface {
    public static void main(String[] args) {
        JFrame appFrame = new JFrame();
        appFrame.setSize(300, 200);
        appFrame.setTitle("Age Calculator");
        appFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JButton button = new JButton("Calculate Age");
        JLabel ageLabel = new JLabel("Your age will be displayed here.");

        panel.add(button);
        panel.add(ageLabel);
        appFrame.add(panel);

        appFrame.setVisible(true);

        button.addActionListener((ActionEvent e) -> {
            String birthDate = JOptionPane.showInputDialog(appFrame, "Please enter your date of birth (MM-dd-yyyy):");
            if (birthDate != null && !birthDate.trim().isEmpty()) {
                AgeCalc ageCalc = new AgeCalc();
                ageCalc.setBirthDate(birthDate);
                int age = ageCalc.calculateAge();
                ageLabel.setText("Your age is: " + age);
            } else {
                JOptionPane.showMessageDialog(appFrame, "Invalid input. Please enter a valid date of birth.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
    }
}