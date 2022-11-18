package com.onowdev.javafundamental.basic.operator;

public class OperatorAritmatika {
    public static void main(String[] args) {
        System.out.println("Operasi Penjumlahan");
        int a = 8;
        int b = 9;
        int c = a + b;
        int d = a - b;
        int e = a * b;
        int f = a / b;
        int hasil_sisa = a % b;

        System.out.println("Nilai pertama 8, Nilai kedua 9");

        System.out.println("Hasil Penjumlahan 8 + 9 adalah: " + c);
        System.out.println("Hasil Pengurangan 8 - 9 adalah: " + d);
        System.out.println("Hasil Perkalian 8 * 9 adalah: " + e);
        System.out.println("Hasil Pembagian 8 / 9 adalah: " + f);
        System.out.println("Sisa hasil bagi 8 % 9 adalah : " + hasil_sisa);

    }
}
