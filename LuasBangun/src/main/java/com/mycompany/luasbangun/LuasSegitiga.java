
package com.mycompany.luasbangun;


public class LuasSegitiga {
    
 // Fungsi untuk menghitung luas segitiga
    public static double hitungLuas(double alas, double tinggi) {
        return 0.5 * alas * tinggi;
    }

    public static void main(String[] args) {
        // Nilai alas dan tinggi
        double alas = 20;
        double tinggi = 10;

        // Menghitung luas
        double luas = hitungLuas(alas, tinggi);

        // Menampilkan hasil
        System.out.println("Luas segitiga dengan alas " + alas + " dan tinggi " + tinggi + " adalah " + luas);
    }
}
