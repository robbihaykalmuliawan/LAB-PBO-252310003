package Pembelajaran_02;

import java.util.Scanner;

public class Latihan05 {

    static boolean cetakTitik(int i, int j, int n) {
        int c = (n - 1) / 2;
        return Math.abs(i - c) + Math.abs(j - c) > c;
    }

    static void versiFor(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(cetakTitik(i, j, n) ? ". " : "  ");
            }
            System.out.println();
        }
    }

    static void versiWhile(int n) {
        int i = 0;
        while (i < n) {
            int j = 0;
            while (j < n) {
                System.out.print(cetakTitik(i, j, n) ? ". " : "  ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan digit terakhir NPM Anda: ");
        int digitNpm = Integer.parseInt(scanner.nextLine().trim()) % 10;
        System.out.print("Masukkan jumlah baris (disarankan ganjil): ");
        int baris = Integer.parseInt(scanner.nextLine().trim());

        if (digitNpm % 2 == 0) {
            versiFor(baris);      
        } else {
            versiWhile(baris);    
        }
        scanner.close();
    }
}
