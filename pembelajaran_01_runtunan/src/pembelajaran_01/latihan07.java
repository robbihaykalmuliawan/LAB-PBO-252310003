package pembelajaran_01;

import java.util.Scanner;

public class latihan07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama lengkap : ");
        String nama = input.nextLine();

        String hasil = nama.replace('a', 'X').replace('i', 'X').replace('u', 'X')
                .replace('e', 'X').replace('o', 'X')
                .replace('A', 'X').replace('I', 'X').replace('U', 'X')
                .replace('E', 'X').replace('O', 'X');

        System.out.println("Hasil : " + hasil);

        input.close();
    }
}