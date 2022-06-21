package com.company;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_First implements ActionListener{

    // these variables are declared for the whole code
    // so it can be accessed in the actionPerformed method
    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel success;

    public static void swing2_do(){

        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(800, 400); // dimensions of window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel); //panel is added to the whole frame

        panel.setLayout(null);

        userLabel = new JLabel("Welcome to the Selkent League");// JLabel is text on the window
        userLabel.setBounds(310,20,350,100);
        panel.add(userLabel);// you have to add everything to panel

        button = new JButton("League table");// creates a button with text
        button.setBounds(330,150,150,50);
        button.addActionListener(new GUI_First());//If button is clicked, runs actionPerformed
        panel.add(button);

        button = new JButton("Individual/ Modify");// creates a button with text
        button.setBounds(330,220,150,50);
        button.addActionListener(new GUI_First());//If button is clicked, runs actionPerformed
        panel.add(button);


        success = new JLabel("");
        success.setBounds(10,110,300,25);
        panel.add(success);


        frame.setVisible(true);




    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Individual/ Modify")){
            GUI_login guiNew = new GUI_login();
        }
    }
}

