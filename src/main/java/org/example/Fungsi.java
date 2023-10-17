package org.example;

public class Fungsi {
    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        int z = 9;

        tambah(x,y);
        tambah(x,z);
        tambah(y,z);
    }
    public static int tambah(int a, int b) {
        int hasilTambah = a+b;
        System.out.println("Hasil tambahh "+a+" dan "+b+" adalah " +hasilTambah);
        return hasilTambah;
    }
}
