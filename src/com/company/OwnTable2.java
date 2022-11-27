package com.company;

import javax.swing.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

// import java.awt.event.ActionEvent
// import java.awt.event.ActionListener;
// import javax.swing.*;
// import java.io.File;
// import java.io.BufferWriter;
// import java.io.FileWriter


public class OwnTable2 {

    String[] column2 = new String[2];
    String[][] data2 = new String[10][2];

    public OwnTable2(String[] oneD, int[] ownList, String TableTop) {

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
        column2[1] = TableTop;


        JTable table = new JTable(data2, column2);

        table.setBounds(0, 400, 100, 500);
        JScrollPane sp = new JScrollPane(table);
        frame.add(sp);

        try {
            File file = new File("C:\\Users\\EddTrapz\\Desktop\\CompIAEnd.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
                FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("  " + TableTop + ": ");
            bw.write("\n ___________");

            for (int i = 0; i < table.getRowCount(); i++) {
                for (int j = 0; j < table.getColumnCount(); j++) {
                    bw.write((String) table.getModel().getValueAt(i, j) + "  ");
                }
                bw.write("\n  \n");
            }
            bw.close();
            fw.close();
            JOptionPane.showMessageDialog(null, "Data Exported");

        }catch(Exception e){
            e.printStackTrace();
        }
    }

}


