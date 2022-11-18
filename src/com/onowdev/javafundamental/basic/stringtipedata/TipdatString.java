package com.onowdev.javafundamental.basic.stringtipedata;

public class TipdatString {
    public static void StringTipdat(){
        String greeeting = "Hello World";
        System.out.println(greeeting);


        char[] andraChars = {'A', 'N', 'D', 'R', 'A'};
        String andraString = new String(andraChars);

        System.out.println(andraString);

        // Mengetahui Panjang String
        String variabelSatu = "DzikirPagiSore";
        int length = variabelSatu.length();

        System.out.println("Panjang Kata -DzikirPagiSore-" + length + "huruf");

        // Mengambil Karakter dari sebuah String

        String codinger = "Ramadhan_JSR";
        char result = codinger.charAt(7);
        System.out.println(result);

    }
}
