package com.company;

public class SortingAlg extends OwnTable{
    String[]oneD = new String [11];
    public SortingAlg(int[] ownList, int Fleetdown, int Nf, int Belv, int PW, int DVW, int DSB, int Chis, int Swan, int JRS, int WW, String tableTop) {
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




// -------------------------------final battle--------------------------------------------------------

        for (int i = 0; i < ownList.length; i++){
            if (Fleetdown == ownList[i]){
                oneD[i]= "Fleetdown";
            }
        }

        for (int i = 0; i < ownList.length; i++){
            if (Nf == ownList[i]){
                oneD[i] = "Northfleet eagles";
            }
        }

        for (int i = 0; i < ownList.length; i++){
            if (Belv == ownList[i]){
                oneD[i] = "Belvedere";
            }
        }


        for (int i = 0; i < ownList.length; i++){
            if (PW == ownList[i]){
                oneD[i] = "Parkwood rangers";
            }
        }

        for (int i = 0; i < ownList.length; i++){
            if (DVW == ownList[i]){
                oneD[i] = "Dulwich village white";
            }
        }


        for (int i = 0; i < ownList.length; i++){
            if (DSB == ownList[i]){
                oneD[i] = "Danson sport black";
            }
        }


        for (int i = 0; i < ownList.length; i++){
            if (Chis == ownList[i]){
                oneD[i] = "Chislehurst";
            }
        }


        for (int i = 0; i < ownList.length; i++){
            if (Swan == ownList[i]){
                oneD[i] = "Swanscombe tigers";
            }
        }


        for (int i = 0; i < ownList.length; i++){
            if (JRS == ownList[i]){
                oneD[i] = "Junior red sabres";
            }
        }


        for (int i = 0; i < ownList.length; i++){
            if (WW == ownList[i]){
                oneD[i] = "Welling wanderers";
            }
        }

String TableTop2 = tableTop + ".";




        new OwnTable2(oneD, ownList, tableTop);
        }
  }

