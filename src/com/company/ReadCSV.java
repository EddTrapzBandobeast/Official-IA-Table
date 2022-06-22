package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSV {

    public ReadCSV(){

// this is sequential file access, reading from CSV_FTable
// better to use and more widely used in Java
// may want to keep the RAF one to have evidence of using RAF



        String line;


    try {
        BufferedReader br = new BufferedReader(new FileReader("CSV_FTable"));

        while((line = br.readLine()) != null){// while the next line is not empty

            String[] Values = line.split(",");// splits when it sees a comma
            System.out.println(Values[0] + Values[1] + Values[2] + Values[3] + Values[4]+ Values[5]);

        }

    }catch (IOException E){
        E.printStackTrace();
    }



    }
}