package com.company;

public class SortingAlg extends OwnTable{

    public SortingAlg(int[] ownList, int Fleetdown) {
        //SORT

        System.out.println("----------");

        boolean swapped = true;

        while (swapped){
            swapped = false;

            for (int i = 0; i < ownList.length - 1; i++){
                if (ownList[i] < ownList[i+1]) {
                    swapped = true;
                    int temp = ownList[i];
                    ownList[i] = ownList[i+1];
                    ownList[i+1] = temp;
                }
            }
        }

        for (int j : ownList) {
            System.out.println(j);
        }

        int[][]twoD = new int [11][2];

        for (int i = 0; i < ownList.length; i++){
            twoD[i][1] = (ownList[i]); // places the ordered list into each row of column2 of the 2d array
        }

        for (int i = 0; i < ownList.length; i++){
            if (Fleetdown == twoD[i][1]){
                twoD[1][0] = Integer.parseInt("Fleetdown");

            }
        }// looks good
        // gonna have to repeat the above 9 more times
        // so gonna have to have 9 more parameters into SortingAlg



        new OwnTable2(ownList);
        }
  }

