package com.onowdev.javafundamental.basic.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListPlanet {
    public static void main(String[] args) {
        //Deklarasi Array

        String [] heroes = new String[2];
        heroes[1] = "Riki";
        //heroes[2] = "sven";
        //heroes[2] = "zeus"; // error ArrayIndexOutOfBoundsException karena ukuran Array tetap

        // Menggunakan Array List

        List<String> planets = new ArrayList<>();
        planets.add("Mercury"); // Method add() untuk menambahkan Objek ke list
        planets.add("Venus");
        planets.add("Earth");
        planets.add("Mars"); // Objek Lainnya masih bisa terus di tambahkan

        System.out.println("List planets awal : ");
        for (int i = 0; i < planets.size(); i++) { // method size() untuk mendapatkan ukuran List
            // method get() untuk melihat isi List pada index i
            System.out.println("\t index-"+ i + " = " + planets.get(i));
        }
        planets.remove("Venus"); // method remove() untuk mengeluarkan objek dari list

        System.out.println("List planets akhir : ");
        for (int i = 0; i < planets.size(); i++){
            System.out.println("\t index-"+ i +" = " + planets.get(i));
        }
    }
}
