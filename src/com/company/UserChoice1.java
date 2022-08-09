package com.company;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserChoice1 implements ActionListener{

    // these variables are declared for the whole code
    // so it can be accessed in the actionPerformed method
    private static JLabel userLabel; 
    private static JButton button1;
    private static JButton button2;


    public UserChoice1(){

        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(800, 500); // dimensions of window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel); //panel is added to the whole frame

        panel.setLayout(null);

        userLabel = new JLabel("Welcome to the Selkent League");// JLabel is text on the window
        userLabel.setBounds(310,20,350,100);
        panel.add(userLabel);// you have to add everything to panel

        button1 = new JButton("League Table");// creates a button with text
        button1.setBounds(330,150,150,50);
        button1.addActionListener(this);//If button is clicked, runs actionPerformed
        panel.add(button1);

        button2 = new JButton("Teams / Personal Table");// creates a button with text
        button2.setBounds(330,220,150,50);
        button2.addActionListener(this);//If button is clicked, runs actionPerformed
        panel.add(button2);



        frame.setVisible(true);




    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("League Table")){
            new GUI_LeagueT();
        }

    else if (e.getActionCommand().equals("Teams / Personal Table")){
            new GUI_login();
    }



  }
}
