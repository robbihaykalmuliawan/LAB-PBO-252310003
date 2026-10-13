package Pembelajaran_02;

import java.util.Scanner;

public class Resto {
    static Scanner scanner = new Scanner(System.in);

    private long Harga;

    public void chooseMenu() {
        System.out.println("Menu Sarapan:");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Bubur Ayam");
        System.out.println("3. Soto Ayam");
        System.out.print("Pilih menu: ");
        int pilihan = Integer.parseInt(scanner.nextLine().trim());

        long harga = getPrices(pilihan);
        switch (pilihan) {
            case 1:
                System.out.println("Anda memesan Nasi Goreng dengan harga Rp " + rupiah(harga) + ",-");
                break;
            case 2:
                System.out.println("Anda memesan Bubur Ayam dengan harga Rp " + rupiah(harga) + ",-");
                break;
            case 3:
                System.out.println("Anda memesan Soto Ayam dengan harga Rp " + rupiah(harga) + ",-");
                break;
            default:
                System.out.println("Maaf menu yang anda masukan salah.");
        }
    }

    private long getPrices(int menu) {
        switch (menu) {
            case 1: Harga = 22000; break;
            case 2: Harga = 15000; break;
            case 3: Harga = 25000; break;
            default: Harga = 0;
        }
        return Harga;
    }

    private String rupiah(long angka) {
        return String.format("%,d", angka).replace(',', '.');
    }
}
