package com.javarush.task.jdk13.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Массив из строк в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String [] list = new String[10];

        for (int i=0; i<list.length-2; i++)
        {
            list [i]=reader.readLine();

        }
        for (int i=list.length; i>0; i--)
        {
            System.out.println(list [i-1]);
        }



    }
}
