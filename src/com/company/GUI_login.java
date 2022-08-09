package com.company;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_login implements ActionListener {

    // these variables are declared for the whole code
    // so it can be accessed in the actionPerformed method
    private static JTextField userText;
    private static JPasswordField passwordText;

    public GUI_login(){

        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(800, 500); // dimensions of window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel); //panel is added to the whole frame

        panel.setLayout(null);

        JLabel userLabel;
        userLabel = new JLabel("User");// JLabel is text on the window
        userLabel.setBounds(250,150,80,25);
        panel.add(userLabel);// you have to add everything to panel

        userText = new JTextField(20);// JTextField is where the user can input
        userText.setBounds(325,150,165,25);
        panel.add(userText);

        JLabel passwordLabel;
        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(250,200,80,25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField();//passwordField = can't see the chars
        passwordText.setBounds(325,200,80,25);
        panel.add(passwordText);

        JButton button;
        button = new JButton("Login");// creates a button with text
        button.setBounds(325,250,80,25);
        button.addActionListener(this);//If button is clicked, runs actionPerformed
        panel.add(button);


        frame.setVisible(true);




    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = passwordText.getText();
        System.out.print(user + ", " + password);


        if (user.equals("e") && password.equals("d")) {
            new UserChoice2();
        }
    }
}