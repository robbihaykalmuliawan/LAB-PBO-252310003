package Pembelajaran_02;

import java.util.Scanner;

public class Latihan04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan digit terakhir NPM Anda: ");
        int digitNpm = Integer.parseInt(scanner.nextLine().trim()) % 10;
        boolean genap = digitNpm % 2 == 0;

        int n;
        do {
            System.out.print("Masukkan nilai faktor (minimal 20): ");
            n = Integer.parseInt(scanner.nextLine().trim());
            if (n < 20) {
                System.out.println("Nilai tidak boleh kurang dari 20!");
            }
        } while (n < 20);

        StringBuilder hasil = new StringBuilder();
        if (genap) {
            // NPM GENAP -> Ascending
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    if (hasil.length() > 0) hasil.append(", ");
                    hasil.append(i);
                }
            }
            System.out.println("ASC : Faktor " + n + " adalah " + hasil);
        } else {
            // NPM GANJIL -> Descending
            for (int i = n; i >= 1; i--) {
                if (n % i == 0) {
                    if (hasil.length() > 0) hasil.append(", ");
                    hasil.append(i);
                }
            }
            System.out.println("DESC : Faktor " + n + " adalah " + hasil);
        }
        scanner.close();
    }
}
