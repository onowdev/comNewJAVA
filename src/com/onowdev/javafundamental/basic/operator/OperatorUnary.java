package com.onowdev.javafundamental.basic.operator;
/*
Merupakan operator yang melakukan berbagai operasi Aritmatik
yang hanya melibatkan satu operand. Operasi-operasi tersebut
dapat berupa penambahan, pengurangan atau membalik suatu nilai
dari bolean. Dalam bahasa pemrograman Java, berikut inilah yang
termasuk Operator Unary :
* */
public class OperatorUnary {
    public static void main(String[] args) {
        System.out.println("Operator Unary Plus");
        int nilaiAwal = 7;
        int hasil = +nilaiAwal;
        System.out.println("Hasil +7 =" + hasil);
        System.out.println();

        System.out.println("Operator Unary Minus");
        int nilaiAwal2 = 9;
        nilaiAwal2 = -nilaiAwal2;
        System.out.println("Hasil -9 =" +nilaiAwal2);
        System.out.println();

        System.out.println("Operator peningkatan nilai sebesar 1 point");
        int nilaiAwal3 = 5;
        nilaiAwal3++;
        System.out.println("Hasil 5++ =" + nilaiAwal3);
        System.out.println();

        System.out.println("Operator pengurangan nilai sebesar 1 point");
        int nilaiAwal4 = 9;
        nilaiAwal4--;
        System.out.println("Hasil 9-- = " +nilaiAwal4);

        System.out.println("Operator Komplemen Logika");
    }
}
