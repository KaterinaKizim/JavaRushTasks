package com.javarush.task.jdk13.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улица и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int [] house = new int[15];
        for (int i = 0; i <house.length; i++) {
          house[i]=Integer.parseInt(reader.readLine());
        }

        int[] houseNechet = new int[7];
        int[] houseChet = new int[8];
        int j=0;
        int k=0;
        for (int i=0;i<15;i++) {
            if (i % 2 == 0) {
                houseChet[j]=house[i];
                j++;

            } else {
                houseNechet[k]=house[i];
                k++;
            }

        }


        int sumNechet=0;
        for (int i = 0; i <houseNechet.length; i++) {
             sumNechet+=houseNechet[i];

        }

        int sumChet=0;
        for (int i = 0; i < houseChet.length ; i++) {
           sumChet+=houseChet[i];
        }



            if
        (sumChet>sumNechet)
            System.out.println("В домах с четными номерами проживает больше жителей.");
        else
            if
            (sumChet<sumNechet)
            System.out.println("В домах с нечетными номерами проживает больше жителей.");


    }
}
