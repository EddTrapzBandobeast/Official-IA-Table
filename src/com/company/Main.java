package com.company;

// Daijobou des

public class Main {
    public static void main(String[] args) {

      welcome();

      //ReadFile First = new ReadFile(); //accesss class: ReadFile
      //news.accRead(89,2,8);// The numbers the user has to enter

        ReadCSV Second = new ReadCSV();
        Second.doRead();



    }
    public static void welcome(){
        System.out.print("Welcome to the Selkent League!" + "\n");
    }

}
