package com.company;

import javax.swing.*;

public class OwnTable2 {

    String[] column2 = new String[2];
    String[][] data2 = new String[10][2];

    public OwnTable2(String[] oneD, int[] ownList) {

        JFrame frame = new JFrame();
        frame.setSize(800, 500);
        frame.setVisible(true);


        for (int i = 1; i < 10; i++) {
            data2[i][0] = oneD[i];
        }

        for (int i = 1; i < 10; i++) {
            data2[i][1] = String.valueOf(ownList[i]);
        }

        column2[0] = "Team";
        column2[1] = "damn.";


        JTable table = new JTable(data2, column2);

        table.setBounds(0, 400, 100, 500);
        JScrollPane sp = new JScrollPane(table);
        frame.add(sp);
    }

    }


