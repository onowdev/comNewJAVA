package com.onowdev.javafundamental.basic;

import com.onowdev.javafundamental.basic.kendaraan.Kreta;
import com.onowdev.javafundamental.basic.kendaraan.Mobil;
import com.onowdev.javafundamental.basic.kendaraan.Motor;
import com.onowdev.javafundamental.basic.musik.Gitar;
import com.onowdev.javafundamental.basic.stringtipedata.TipdatString;
import com.onowdev.javafundamental.basic.tipedata.DataTipe;
import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");

        Gitar.Bunyi();

        Mobil.jumlahBan();
        Mobil.drive();
        Kreta.jumlahBan();
        Motor.jumlahBan();

        Date today = new Date();
        System.out.println("hari ini = " + today);

        Date tomorrow = DateUtils.addDays(today, 1);
        System.out.println("Besok = "+ tomorrow);

        DataTipe.JenisData();

        TipdatString.StringTipdat();

    }
}
