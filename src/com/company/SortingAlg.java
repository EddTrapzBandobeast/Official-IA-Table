package com.company;

public class SortingAlg extends  OwnTable{

    public SortingAlg() {
        //SORT






        System.out.println("----------");

        System.out.println(ownList[2]);

        System.out.println("----------");

        boolean swapped = true;

        while (swapped){
            swapped = false;

            for (int i = 0; i < ownList.length - 1; i++){
                if (ownList[i] > ownList[i+1]) {
                    swapped = true;
                    int temp = ownList[i];
                    ownList[i] = ownList[i+1];
                    ownList[i+1] = temp;
                }
            }
        }
        System.out.println(ownList[0]);
        System.out.println(ownList[9]);
        }
  }

