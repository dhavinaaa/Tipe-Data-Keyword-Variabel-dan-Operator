
package com.mycompany.luasbangun;

    public class LuasLingkaran {
    
             // Fungsi untuk menghitung luas lingkaran
        public static double hitungLuas(double jariJari) {
            double phi = 3.14159;
            return phi * jariJari * jariJari;
    }

        public static void main(String[] args) {
            // Nilai jari-jari
             double jariJari = 10;

            // Menghitung luas
            double luas = hitungLuas(jariJari);

            // Menampilkan hasil
            System.out.println("Luas lingkaran dengan jari-jari " + jariJari + " adalah " + luas);
    }
}
