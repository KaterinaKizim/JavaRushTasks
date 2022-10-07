package com.javarush.task.jdk13.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Два массива
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int [] array =new int[10];
        String [] list = new String[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i <list.length; i++) {
            list[i] = reader.readLine();
            array[i]=list[i].length();
            System.out.println(array[i]);
        }





    }
}
