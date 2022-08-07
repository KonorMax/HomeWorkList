package com.konor.HomeWorkList;

//1.Ввести строки с консоли, записать в список.
//Вывести строки в консоль в обрат- ном порядке.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ListEx {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter some names: ");
        String[] list = br.readLine().split(" ");
        String newLine = "";

        for (String string : list) {
            newLine = string + " " + newLine;
        }
        System.out.println("You entered your name: " + newLine);

        br.close();
    }
}







