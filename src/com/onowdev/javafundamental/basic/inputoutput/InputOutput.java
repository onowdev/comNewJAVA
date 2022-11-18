package com.onowdev.javafundamental.basic.inputoutput;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program Penjumlahan Sederhana");

        System.out.println("Masukan Angka Pertama");
        int value1 = scanner.nextInt();

        System.out.println("Masukan angka Kedua");
        int value2 = scanner.nextInt();

        int result = value1 + value2;

        System.out.println("Hasil Penjumlahan tersebut adalah : " + result);

    }
}
