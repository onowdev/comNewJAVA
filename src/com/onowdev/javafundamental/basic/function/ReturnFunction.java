package com.onowdev.javafundamental.basic.function;

public class ReturnFunction {
    public static void main(String[] args) {
        double p = 7;
        double l = 6.5;

        double hasil = hitungLuas(p, l); // memanggil fungsi

        System.out.println("Hasilnya adalah = " + hasil);
    }

    // Fungsi dengan Nilai Balik

    public static double hitungLuas(double panjang, double lebar){
        double luas = panjang * lebar;
        return luas;
    }

}
