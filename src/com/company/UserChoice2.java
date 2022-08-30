package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserChoice2 implements ActionListener {

    // these variables are declared for the whole code
    // so it can be accessed in the actionPerformed method
    private static JLabel userLabel;
    private static JButton button1;
    private static JButton button2;


    public UserChoice2(){

        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(800, 500); // dimensions of window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel); //panel is added to the whole frame

        panel.setLayout(null);

        button1 = new JButton("Pause");// creates a button with text
        button1.setBounds(330,150,150,50);
        button1.addActionListener(this);//If button is clicked, runs actionPerformed
        panel.add(button1);

        button2 = new JButton("Personal Table");// creates a button with text
        button2.setBounds(330,220,150,50);
        button2.addActionListener(this);//If button is clicked, runs actionPerformed
        panel.add(button2);



        frame.setVisible(true);




    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Pause")){
            new Pause();
        }

        else if (e.getActionCommand().equals("Personal Table")){
            new OwnTable();
        }



    }
}
