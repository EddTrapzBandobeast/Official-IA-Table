package com.company;

import java.util.ArrayList;
import java.io.RandomAccessFile;
import java.io.IOException;
import java.util.Scanner;



public class RAF {
    public static int accRead(int option1, int options2, int idk) {

        Scanner input = new Scanner(System.in);


        System.out.println("\n" + "1.) See league table");
        System.out.println("2.) only sepcific team");
        System.out.println("3.) Fact file team");

        System.out.print("What would you like to do? ");
        int overall = input.nextInt();

        // overall if statement
        if ( overall == option1){
            for (int i = 0; i < 11; i++){
                String output1 = readFile(i, (i+1), 54);
                System.out.println(output1);
            }


        } else if (overall == options2){

            System.out.print("What position in the league? ");
            int specific = input.nextInt();

            String output2 = readFile(0, 1, 54);
            System.out.print("\n" + output2);

            String output = readFile(specific, specific+1, 54);
            System.out.println(output);
        } else{
            for (int i = 0; i < 11; i++){
                String output1 = readFile(i, (i+1), 54);
                System.out.println(output1);
            }
            System.out.print("What postion are the team you would like to Modify? ");
            int SpecialTeam = input.nextInt();

            String output = readFile2(SpecialTeam, 22, 54);
            System.out.println(output);
        }


return idk;

    }

    public static String readFile(int lineStart, int lineEnd, int charsPerLine) {

        String data = "  ";

        ArrayList<String> FTeam = new ArrayList<String>(); // creates an array list
        int bytesPerLine = charsPerLine + 1 ;

        try {
            RandomAccessFile technique = new RandomAccessFile("RAF.FootballTable.txt", "rw");

            for (int i = lineStart; i < lineEnd; i++) { // loop through the lines
                technique.seek(bytesPerLine * i); // finds the start of line
                data = technique.readLine(); // holds each line
                System.out.print(data); // adds it to array List
            }
            technique.close();

        } catch (IOException E) {
            System.out.print("Error done occured");
        }

        String data1 = "  ";

        for (int i = 0; i < FTeam.size(); i++) {
            data1 += FTeam.get(i); // retrieves contents of array

        }
        return data1; // returns whats in array

    }

    public static String readFile2(int lineStart2, int pts, int charsPerLine2) {

        int bytesPerLine = charsPerLine2 + 1 ;

        try {
            RandomAccessFile technique2 = new RandomAccessFile("RAF.FootballTable.txt", "rw");



            //technique2.seek((bytesPerLine * lineStart2) + pts);
            //technique2.
            //System.out.print(technique2.toString(););

            technique2.close();

        } catch (IOException E) {
            System.out.print("Error done occured");
        }

        String data1 = "  ";


        return data1; // returns whats in array


    }

}
