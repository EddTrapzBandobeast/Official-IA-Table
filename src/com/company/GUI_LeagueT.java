package com.company;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_LeagueT {


    private static JButton button2;
    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel Title;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel success;

    public GUI_LeagueT(){

        JPanel panel = new JPanel();
        JFrame frame = new JFrame();


        frame.setSize(1000,700);
        frame.setVisible(true);




        String data[][]={ {"101","Amit","670000"},
                          {"102","Jai","780000"},
                          {"101","Sachin","700000"}};
        String column[]={"ID","NAME","SALARY"};

        JTable table = new JTable(data,column);

        table.setBounds(0,400,200,300);
        JScrollPane sp=new JScrollPane(table);
        frame.add(sp);

        }

    }






