package com.onowdev.javafundamental.basic.array;

public class LoopingArray {
    public static void main(String[] args) {
        int [] arrInt = new int [1000000];

        // inisiasi dan menampilkan arrInt
        for (int x = 0; x < arrInt.length; x++) {
            arrInt[x] = x + 1;
            System.out.println(arrInt[x]);
        }
    }
}
