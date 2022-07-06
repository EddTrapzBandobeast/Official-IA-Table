package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class ReadCSV {

    protected static String[][] myArray;

    public ReadCSV() {

// this is sequential file access, reading from CSV_FTable
// better to use and more widely used in Java
// may want to keep the RAF one to have evidence of using RAF


        myArray = new String[11][6];

        Scanner input = null;
        int Row = 0;
        String inputLine = "";


        try {
            input = new Scanner(new BufferedReader(new FileReader("CSV_FTable")));

            while (input.hasNextLine()) {

                inputLine = input.nextLine();

                String[] tempArray = inputLine.split(",");

                System.out.println(tempArray[5]);

                for (int i = 0; i < 6; i++) {
                    myArray[Row][i] = tempArray[i];
                }

                Row++;
            }
            System.out.println(myArray.length);

        } catch (IOException E) {
            E.printStackTrace();
        }





    }
}