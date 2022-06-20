package com.company;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_login implements ActionListener {

    // these variables are declared for the whole code
    // so it can be accessed in the actionPerformed method
    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel success;

    public static void swing1_do(){

        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(350, 200); // dimensions of window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel); //panel is added to the whole frame

        panel.setLayout(null);

        userLabel = new JLabel("User");// JLabel is text on the window
        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);// you have to add everything to panel

        userText = new JTextField(20);// JTextField is where the user can input
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField();//passwordField = can't see the chars
        passwordText.setBounds(100,50,80,25);
        panel.add(passwordText);

        button = new JButton("Login");// creates a button with text
        button.setBounds(10,80,80,25);
        button.addActionListener(new GUI_login());//If button is clicked, runs actionPerformed
        panel.add(button);

        success = new JLabel("");
        success.setBounds(10,110,300,25);
        panel.add(success);


        frame.setVisible(true);




    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = passwordText.getText();
        System.out.print(user + ", " + password);


        if (user.equals("eddie") && password.equals("778")) {
            success.setText("Login successful");
        }
    }
}

