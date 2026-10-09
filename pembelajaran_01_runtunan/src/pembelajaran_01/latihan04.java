package pembelajaran_01;

import java.util.Scanner;

public class latihan04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan teks : ");
        String teks = input.nextLine();

        System.out.println("Hasil : " + teks.toUpperCase());

        input.close();
    }
}