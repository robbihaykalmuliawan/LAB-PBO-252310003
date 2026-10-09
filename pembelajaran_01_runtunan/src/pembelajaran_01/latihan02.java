package pembelajaran_01;

import java.util.Scanner;

public class latihan02 {
    static double phi = 3.14;
    static double r;
    static double t;

    static double luasKerucut() {
        double s = Math.sqrt(r * r + t * t); 
        return phi * r * (r + s);
    }

    static double volumeKerucut() {
        return phi * r * r * t / 3;
    }

    static double luasTabung() {
        return 2 * phi * r * (r + t);
    }

    static double volumeTabung() {
        return phi * r * r * t;
    }

    static void tampilKerucut() {
        System.out.println("Luas Kerucut   : " + luasKerucut());
        System.out.println("Volume Kerucut : " + volumeKerucut());
    }

    static void tampilTabung() {
        System.out.println("Luas Tabung    : " + luasTabung());
        System.out.println("Volume Tabung  : " + volumeTabung());
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("KERUCUT");
        System.out.print("Jari-jari : ");
        r = input.nextDouble();
        System.out.print("Tinggi    : ");
        t = input.nextDouble();
        tampilKerucut();

        System.out.println("TABUNG");
        System.out.print("Jari-jari : ");
        r = input.nextDouble();
        System.out.print("Tinggi    : ");
        t = input.nextDouble();
        tampilTabung();

        input.close();
    }
}