package Praktikum_1;

import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);

        
        double hargaTanah = 5000000; // Rp. 5.000.000
        double luas;
        double hargaTotal;

       
        System.out.print("Masukkan luas tanah (m2): ");
        luas = input.nextDouble();

        
        hargaTotal = hargaTanah * luas;

       
        System.out.println("Harga tanah per m2 : Rp " + hargaTanah);
        System.out.println("Luas tanah         : " + luas + " m2");
        System.out.println("Harga total tanah  : Rp " + hargaTotal);
        
        input.close();
    }
}