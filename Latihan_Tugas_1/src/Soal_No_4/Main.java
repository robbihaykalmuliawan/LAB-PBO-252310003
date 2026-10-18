package Soal_No_4;

public class Main {
    public static void main(String[] args) {
        Hewan h1 = new Kucing();   // tipe referensi: Hewan, tipe objek sebenarnya: Kucing
        Hewan h2 = new Anjing();   // yang dijalankan: Kucing.suara() (ditentukan saat runtime)
        h1.suara();
        h2.suara();
    }
}