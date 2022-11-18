package com.onowdev.javafundamental.basic.operator;
/*
Operator Equality and Relational digunakan untuk
menentukan dan membandingkan antara 2 variabel (operand)
yang menghasilkan nilai True atau False.
* */
public class OperatorEquality {
    public static void main(String[] args) {

        int value = 5;
        int anotherValue = 4;
        boolean result;
        result = value == anotherValue;

        System.out.println("Hasil 'value == anotherValue' adalah " + result);
        System.out.println();

        System.out.println("Tidak sama dengan ...");
        result = value != anotherValue;
        System.out.println("Hasil 'value != anotherValue' adalah " + result);
        System.out.println();

        System.out.println("Lebih Besar dari ...");
        result = value > anotherValue;
        System.out.println("Hasil 'value > anotherValue' adalah " +result);
        System.out.println();

        System.out.println("Sama atau lebih besar dari...");
        result = value >= anotherValue;
        System.out.println("Hasil 'value >= anotherValue' adalah " +result);
    }
}
