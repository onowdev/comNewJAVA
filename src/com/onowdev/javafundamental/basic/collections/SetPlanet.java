package com.onowdev.javafundamental.basic.collections;

import java.util.*;

public class SetPlanet {
    public static void main(String[] args) {
        // Menggunakan HashSet

        Set<String> planets = new HashSet<>();

        planets.add("mercury"); // method add() untuk menambahkan objek ke set
        planets.add("venus");
        planets.add("earth");
        planets.add("earth"); // menambahkan objek earth beberapa kali
        planets.add("earth");
        planets.add("mars");

        //method size() untuk mendapatkan ukuran set
        System.out.println("Set planets awal : (size = " + planets.size() + ")");
        for (String planet : planets){
            System.out.println("\t " + planet);

        }
        planets.remove("venus");

        System.out.println("Set planets akhir : (size = " + planets.size() + ")");
        for (Iterator iterator = planets.iterator(); iterator.hasNext(); ) {
            // looping dengan iterator
            System.out.println("\t " + iterator.next());
        }
    }
}
