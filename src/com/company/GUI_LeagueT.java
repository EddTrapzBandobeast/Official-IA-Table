package com.company;


import javax.swing.*;

public class GUI_LeagueT {

    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel Title;
    private static JButton button;
    private static JLabel success;

    public GUI_LeagueT(){

        JPanel panel = new JPanel();
        JFrame frame = new JFrame();


        frame.setSize(800,500);
        frame.setVisible(true);



        String column1[] = new String[6];
        String data1[][] = new String[6][10];

        String column[]={"Team","Played","won","Drawn","Lost","Points"};
        String data[][]={ {"Fleetdown United","16","670000","670000","670000","670000"},
                          {"Northfleet Eagles","18","780000","670000","670000","670000"},
                          {"Belvedere Youth","18","780000","670000","670000","670000"},
                          {"Parkwood Rangers Green","17","780000","670000","670000","670000"},
                          {"Dulwich Village White","17","780000","670000","670000","670000"},
                          {"Danson Sports Black","18","780000","670000","670000","670000"},
                          {"Chislehurst Wanderers","17","780000","670000","670000","670000"},
                          {"Swanscombe Tigers","16","780000","670000","670000","670000"},
                          {"Junior Reds Sabres","17","780000","670000","670000","670000"},
                          {"Welling Wanderers","18","700000","670000","670000","670000"}};




        JTable table = new JTable(data,column);

        table.setBounds(0,400,200,800);
        JScrollPane sp=new JScrollPane(table);
        frame.add(sp);

        }

    }






