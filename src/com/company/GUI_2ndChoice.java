package com.company;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_2ndChoice implements ActionListener {

    private static JLabel userLabel;
    private static JLabel userLabel2;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button1;
    private static JButton button2;
    private static JLabel success;

    public GUI_2ndChoice(){

        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(800, 500); // dimensions of window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel); //panel is added to the whole frame

        panel.setLayout(null);

        userLabel = new JLabel("Thank you for logging in!");// JLabel is text on the window
        userLabel.setBounds(310,10,550,100);
        panel.add(userLabel);// you have to add everything to panel

        userLabel2 = new JLabel("What would you like to do?");// JLabel is text on the window
        userLabel2.setBounds(310,40,550,100);
        panel.add(userLabel2);// you have to add everything to panel

        button1 = new JButton("Specific League Table");// creates a button with text
        button1.setBounds(310,160,200,50);
        button1.addActionListener(this);//If button is clicked, runs actionPerformed
        panel.add(button1);

        button2 = new JButton("Individual Team Information");// creates a button with text
        button2.setBounds(310,240,200,50);
        button2.addActionListener(this);//If button is clicked, runs actionPerformed
        panel.add(button2);


        success = new JLabel("");
        success.setBounds(10,110,300,25);
        panel.add(success);


        frame.setVisible(true);




    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Specific League Table")){
            GUI_login guiNew = new GUI_login();
        }

        else if (e.getActionCommand().equals("Individual Team Information")){
            GUI_LeagueT league = new GUI_LeagueT();
        }


    }
}
