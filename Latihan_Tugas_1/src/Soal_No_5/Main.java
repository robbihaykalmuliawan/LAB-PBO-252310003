package Soal_No_5;

public class Main {
    public static void main(String[] args) {
        Kalkulator k = new Kalkulator();
        System.out.println("Overloading:");
        System.out.println(k.tambah(2, 3));
        System.out.println(k.tambah(2.5, 3.5));
        System.out.println(k.tambah(1, 2, 3));

        System.out.println("Overriding:");
        Hewan h = new Anjing();
        h.suara();
    }
}