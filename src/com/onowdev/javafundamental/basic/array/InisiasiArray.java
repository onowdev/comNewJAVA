package com.onowdev.javafundamental.basic.array;

public class InisiasiArray {
    public static void main(String[] args) {
        int [] arrInt = new int[] {1,2,3,4,5,6};

        System.out.println(arrInt[0]);
        System.out.println(arrInt[1]);
        System.out.println(arrInt[2]);
        System.out.println(arrInt[3]);
        System.out.println(arrInt[4]);
        System.out.println(arrInt[5]);

    // Cara Lain inisialisasi Array

            int [] arrInt2 = new int[7]; // menentukan variabel dan Panjang Array
            arrInt2[0] = 1;
            arrInt2[1] = 2;
            arrInt2[2] = 3;
            arrInt2[3] = 4;
            arrInt2[4] = 5;
            arrInt2[5] = 6;
            arrInt2[6] = 7;
            //arrInt2[7] = 8;

            System.out.println(arrInt2[0]);
            System.out.println(arrInt2[1]);
            System.out.println(arrInt2[2]);
            System.out.println(arrInt2[3]);
            System.out.println(arrInt2[4]);
            System.out.println(arrInt2[5]);
            System.out.println(arrInt2[6]);
            //System.out.println(arrInt2[7]);

    }
}
