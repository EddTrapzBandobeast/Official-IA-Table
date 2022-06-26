package com.company;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ReadCSV {

    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel Title;
    private static JButton button;
    private static JLabel success;
    public ReadCSV(){

// this is sequential file access, reading from CSV_FTable
// better to use and more widely used in Java
// may want to keep the RAF one to have evidence of using RAF




        //JPanel panel = new JPanel();
        //JFrame frame = new JFrame();


        //frame.setSize(800,500);
        //frame.setVisible(true);


       String line;

        String data1[][] = new String[11][7];
        String Values[];

    try {
        BufferedReader br = new BufferedReader(new FileReader("CSV_FTable"));

        String column1[] = new String[6];



            if (br.readLine() != null) {// while the next line is not empty
                line = br.readLine();

                 Values = line.split(",");// splits when it sees a comma
                System.out.print(Values[5]);


}










        //JTable table = new JTable(data1,column1);
         // table.setBounds(0,400,200,800);
           // JScrollPane sp=new JScrollPane(table);
            //frame.add(sp);



    }catch (IOException E){
        E.printStackTrace();
    }



    }
}