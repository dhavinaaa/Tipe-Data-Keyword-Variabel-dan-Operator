
package com.mycompany.persamaankuadrat;
import java.util.Scanner;

public class PersamaanKuadrat {
    public static void main(String[] args) {
        // Persamaan pertama: x^2 + 2x - 4 = 0
        hitungAkarPersamaan(1, 2, -4);

        // Persamaan kedua: 2x^2 + 6x - 10 = 0
        hitungAkarPersamaan(2, 6, -10);
    }

    // Metode untuk menghitung akar-akar persamaan kuadrat menggunakan rumus ABC
    public static void hitungAkarPersamaan(double a, double b, double c) {
        // Menghitung diskriminan
        double diskriminan = Math.pow(b, 2) - 4 * a * c;

        // Mengecek kondisi diskriminan
        if (diskriminan > 0) {
            // Dua akar nyata
            double x1 = (-b + Math.sqrt(diskriminan)) / (2 * a);
            double x2 = (-b - Math.sqrt(diskriminan)) / (2 * a);
            System.out.println("Persamaan dengan a=" + a + ", b=" + b + ", c=" + c);
            System.out.println("Akar-akar persamaan: x1 = " + x1 + ", x2 = " + x2);
        } else if (diskriminan == 0) {
            // Satu akar nyata (akar kembar)
            double x = -b / (2 * a);
            System.out.println("Persamaan dengan a=" + a + ", b=" + b + ", c=" + c);
            System.out.println("Akar pers  amaan: x = " + x);
        } else {
            // Tidak ada akar nyata (akar imajiner)
            System.out.println("Persamaan dengan a=" + a + ", b=" + b + ", c=" + c);
            System.out.println("Persamaan tidak memiliki akar nyata.");
        }
    }
}