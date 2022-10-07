package com.javarush.task.jdk13.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] array = new int[20];
        for (int i=0; i<array.length; i++)
        {
            String s = reader.readLine();
            array [i] = Integer.parseInt(s);
        }
        int [] arrayOne = new int[10];
        int [] arrayTwo = new int[10];

        for (int i = 0; i <10 ; i++)
        {
            arrayOne[i]=i+1;
        }
        for (int i = 10; i <20 ; i++)
        {
            System.out.println(arrayTwo[i+1]);
        }
    }
}
