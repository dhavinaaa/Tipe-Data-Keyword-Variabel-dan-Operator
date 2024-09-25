

package com.mycompany.luasbangun;

    
public class LuasBangun {

    // Fungsi untuk menghitung luas
    public static int hitungLuas(int panjang, int lebar) {
        return panjang * lebar;
    }

    public static void main(String[] args) {
        // Nilai panjang dan lebar
        int panjang = 20;  
        int lebar = 30;

        // Menghitung luas
        int luas = hitungLuas(panjang, lebar);

        // Menampilkan hasil
        System.out.println("Luas bangun dengan panjang " + panjang + " dan lebar " + lebar + " adalah " + luas);
    }
}
