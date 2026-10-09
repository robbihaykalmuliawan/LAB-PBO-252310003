package Praktikum_2;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sisi a: ");
        int a = input.nextInt();

        System.out.print("Masukkan sisi b: ");
        int b = input.nextInt();

        System.out.print("Masukkan sisi c: ");
        int c = input.nextInt();

        Segitiga s1 = new Segitiga(a, b, c);

        if (s1.a * s1.a + s1.b * s1.b == s1.c * s1.c) {
            System.out.println("Segitiga siku-siku sempurna");
        } else {
            System.out.println("Bukan segitiga siku-siku sempurna");
        }

        input.close();
    }
}