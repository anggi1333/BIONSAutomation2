package org.example;

import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int jumlah=0;
        for (int i = 1; i <= 2021; i++) {
            if(i%3==0 && i%7==0){
                jumlah=jumlah+i;
            }}
        System.out.println(String.valueOf(jumlah));
    }
}