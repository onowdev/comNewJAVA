package com.onowdev.javafundamental.basic.tipedata;

public class DataTipe {
    /* Dalam Java Kita mengenal ada 8 tipe data Yang di dukung Java dan 1 tipe reference
    1. Byte
    2. Short
    3. Integer
    4. Long Integer
    5. Float
    6. Double
    7. Boolean
    8. Char

    9. String
    */

    public static void JenisData() {

        byte iniByte = 10; // menampung integer 8 bit
        System.out.println(" ini tipe data byte" + iniByte);

        short iniShort = 9900; // menampung integer 16 bit
        System.out.println("ini tipe data short" + iniShort);

        int iniInteger = 900000;// menampung nilai 32 bit
        System.out.println("ini tipe data integer" +iniInteger);

        long iniLong = 90000L; // Menyimpan data 64bit dan memiliki nilai default 0l
        System.out.println("ini tipe data long" +iniLong);

        float iniFloat = 3.8f; // Menampung tipe data desimal dengan nilai default 0.0f
        System.out.println("ini tipe data float" +iniFloat);

        double iniDouble = 9.0; //Manamoung tipe data seperti float, namun memiliki kapasitas yang lebih besar, nilai default 0.0d
        System.out.println("ini tipe data double" + iniDouble);

        boolean value = true; // tipe data yang memiliki 2 macam nilai true dan false
        boolean anotherValue = false;
        System.out.println("ini bernilai Benar = "+true);
        System.out.println(" ini bernilai Salah = "+false);

        char iniChar= 'A'; // Merupakan tipe data yg digunakan menampung karakter dan ditandai dengan petik 1 (' ')
        System.out.println("ini contoh tipe Char =" +iniChar);

        // Tipe Data Reference
        /* merupakan sebuah tipe data yang merujuk
        ke sebuah objek atau instance dari sebuah class.
        Salah satu tipe data yang termasuk ke dalam tipe
        data reference adalah string. */
    }
}
