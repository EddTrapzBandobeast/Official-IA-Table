package com.company;


import javax.swing.*;

public class GUI_LeagueT extends ReadCSV {

    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel Title;
    private static JButton button;
    private static JLabel success;

        String column1[] = new String[6];
        String data1[][] = new String[6][10];

    public GUI_LeagueT(){
        //super();

        JPanel panel = new JPanel();
        JFrame frame = new JFrame();


        frame.setSize(800,500);
        frame.setVisible(true);



// almost there, just need to be able to find the correct no. of for loops and indexes to place myArray perfectly in data1
// the first row of myArray is not needed because column1 takes care of the first row


        for( int i = 1; i <6; i ++){
            for( int k = 0; k < 6; k ++) {
                data1[i][k] = myArray[i][k];

               }

          }

        for( int j = 0; j < 6; j ++){
            column1[j] = myArray[0][j];
        }

        JTable table = new JTable(data1,column1);

        table.setBounds(0,400,200,800);
        JScrollPane sp=new JScrollPane(table);
        frame.add(sp);

        }

    }






