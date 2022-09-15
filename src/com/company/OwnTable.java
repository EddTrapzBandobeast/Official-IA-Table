package com.company;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OwnTable implements ActionListener {
    // To do:
    // so the user can enter a number and it gets saved into a variable

    private static JLabel userLabel;
    private static JButton button1;
    private static JButton button2;
    private static JButton button3;
    private static JButton button4;
    private static JButton button5;
    private static JButton button6;
    private static JButton button7;
    private static JButton button8;
    private static JButton button9;
    private static JButton button10;
    private static JButton goButton;
    private static JTextField userText;
    private static JTextField userText1;
    private static JTextField userText2;
    private static JTextField userText3;
    private static JTextField userText4;
    private static JTextField userText5;
    private static JTextField userText6;
    private static JTextField userText7;
    private static JTextField userText8;
    private static JTextField userText9;
    private static JTextField userText10;

    int []ownList = new int[10];


    public OwnTable(){

        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(800, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        JLabel tableVariable;
        tableVariable = new JLabel("What would you like to sort?");
        tableVariable.setBounds(50,50,280,30);
        panel.add(tableVariable);

        userText = new JTextField(50);
        userText.setBounds(50,75,165,25);
        panel.add(userText);

        userLabel = new JLabel("Teams:");
        userLabel.setBounds(50,90,550,100);
        panel.add(userLabel);

        button1 = new JButton("Fleetdown United");
        button1.setBounds(50,160,175,50);
        button1.addActionListener(this);
        panel.add(button1);
        userText1 = new JTextField(25);
        userText1.setBounds(50,215,25,25);
        panel.add(userText1);

        button2 = new JButton("Northfleet Eagles");
        button2 .setBounds(235,160,175,50);
        button2 .addActionListener(this);
        panel.add(button2);
        userText2 = new JTextField(25);
        userText2.setBounds(235,215,25,25);
        panel.add(userText2);

        button3 = new JButton("Belvedere Youth");
        button3.setBounds(420,160,175,50);
        button3.addActionListener(this);
        panel.add(button3);
        userText3 = new JTextField(25);
        userText3.setBounds(420,215,25,25);
        panel.add(userText3);

        button4 = new JButton("Parkwood Rangers (G)");
        button4.setBounds(605,160,175,50);
        button4.addActionListener(this);
        panel.add(button4);
        userText4 = new JTextField(25);
        userText4.setBounds(605,215,25,25);
        panel.add(userText4);

        button5 = new JButton("Dulwich Village White");
        button5.setBounds(50,250,175,50);
        button5.addActionListener(this);
        panel.add(button5);
        userText5 = new JTextField(25);
        userText5.setBounds(50,305,25,25);
        panel.add(userText5);

        button6 = new JButton("Danson Sports Black");
        button6.setBounds(235,250,175,50);
        button6.addActionListener(this);
        panel.add(button6);
        userText6 = new JTextField(25);
        userText6.setBounds(235,305,25,25);
        panel.add(userText6);

        button7 = new JButton("Chislehurst Wanderers");
        button7.setBounds(420,250,175,50);
        button7.addActionListener(this);
        panel.add(button7);
        userText7 = new JTextField(25);
        userText7.setBounds(420,305,25,25);
        panel.add(userText7);

        button8 = new JButton("Swanscombe Tigers");
        button8.setBounds(605,250,175,50);
        button8.addActionListener(this);
        panel.add(button8);
        userText8 = new JTextField(25);
        userText8.setBounds(605,305,25,25);
        panel.add(userText8);

        button9 = new JButton("Junior Reds Sabres");
        button9.setBounds(50,340,175,50);
        button9.addActionListener(this);
        panel.add(button9);
        userText9 = new JTextField(25);
        userText9.setBounds(50,395,25,25);
        panel.add(userText9);

        button10 = new JButton("Welling Wanderers");
        button10.setBounds(235,340,175,50);
        button10.addActionListener(this);
        panel.add(button10);
        userText10 = new JTextField(25);
        userText10.setBounds(235,395,25,25);
        panel.add(userText10);



        goButton = new JButton("Make Table");
        goButton.setBounds(605,400,130,35);
        goButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {



                ownList[0]  = Integer.parseInt(userText1.getText());
                ownList[1] = Integer.parseInt(userText2.getText());
                ownList[2] = Integer.parseInt(userText3.getText());
                ownList[3] = Integer.parseInt(userText4.getText());
                ownList[4] = Integer.parseInt(userText5.getText());
                ownList[5] = Integer.parseInt(userText6.getText());
                ownList[6] = Integer.parseInt(userText7.getText());
                ownList[7] = Integer.parseInt(userText8.getText());
                ownList[8] = Integer.parseInt(userText9.getText());
                ownList[9] = Integer.parseInt(userText10.getText());

                int Fleetdown = Integer.parseInt(userText1.getText());
                int Nf =  Integer.parseInt(userText2.getText());
                int Belv =  Integer.parseInt(userText3.getText());
                int PW =  Integer.parseInt(userText4.getText());
                int DVW =  Integer.parseInt(userText5.getText());
                int DSB =  Integer.parseInt(userText6.getText());
                int Chis =  Integer.parseInt(userText7.getText());
                int Swan =  Integer.parseInt(userText8.getText());
                int JRS =  Integer.parseInt(userText9.getText());
                int WW =  Integer.parseInt(userText10.getText());





                for (int j : ownList) {
                    System.out.println(j);
                }


                new SortingAlg(ownList, Fleetdown, Nf, Belv, PW, DVW, DSB, Chis, Swan, JRS, WW);

            }

        });

        panel.add(goButton);

        frame.setVisible(true);




    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}