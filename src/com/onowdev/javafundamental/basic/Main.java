package com.onowdev.javafundamental.basic;

import com.onowdev.javafundamental.basic.kendaraan.Kreta;
import com.onowdev.javafundamental.basic.kendaraan.Mobil;
import com.onowdev.javafundamental.basic.kendaraan.Motor;
import com.onowdev.javafundamental.basic.musik.Gitar;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");

        Gitar.Bunyi();

        Mobil.jumlahBan();
        Kreta.jumlahBan();
        Motor.jumlahBan();
    }
}
