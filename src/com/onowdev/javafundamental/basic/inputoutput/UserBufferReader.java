package com.onowdev.javafundamental.basic.inputoutput;

import java.io.BufferedReader;
import  java.io.IOException;
import java.io.InputStreamReader;

public class UserBufferReader {
    public static void main(String[] args) {

        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(streamReader);

        System.out.println("Program penjumlahan Sederhana");

        int value = 0;
        int anotherValue = 0;

        try {
            System.out.println("Masukan Angka Pertama : ");
            value = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Masukan Angka Kedua : ");
            anotherValue = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        int result = value + anotherValue;
        System.out.println("Hasilnya adalah : " + result);

    }
}
