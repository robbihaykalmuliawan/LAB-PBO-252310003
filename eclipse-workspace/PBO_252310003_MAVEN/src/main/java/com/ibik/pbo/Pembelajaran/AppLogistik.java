package com.ibik.pbo.Pembelajaran;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AppLogistik {

    static final String JUDUL = "PT. XYZ Logistik";
    static final int HARGA_PER_100_GR = 5000;   
    static final int HARGA_PER_10_KM = 8000;    

    static ArrayList<ArrayList<String>> dataPesanan = new ArrayList<ArrayList<String>>();
    static int counterResi = 0;

    static boolean konfirmasiKeluar() {
        int jawab = JOptionPane.showConfirmDialog(null, "Apakah anda ingin keluar ?",
                JUDUL, JOptionPane.YES_NO_OPTION);
        return jawab == JOptionPane.YES_OPTION;
    }

    static String bacaTeks(String pesan) {
        while (true) {
            String s = JOptionPane.showInputDialog(null, pesan, JUDUL, JOptionPane.QUESTION_MESSAGE);
            if (s == null) {                     
                if (konfirmasiKeluar()) {
                    System.exit(0);
                }
                return null;
            }
            if (!s.trim().isEmpty()) {
                return s.trim();
            }
        }
    }

    static Double bacaAngka(String pesan) {
        while (true) {
            String s = bacaTeks(pesan);
            if (s == null) {
                return null;
            }
            try {
                double angka = Double.parseDouble(s);
                if (angka <= 0) {
                    JOptionPane.showMessageDialog(null, "Masukan angka", JUDUL,
                            JOptionPane.ERROR_MESSAGE);
                    continue;
                }
                return angka;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Masukan angka", JUDUL,
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    static void inputPesanan() {
        String barang = bacaTeks("Nama barang :");
        if (barang == null) return;

        Double berat = bacaAngka("Berat barang (gram) :");
        if (berat == null) return;

        Double jarak = bacaAngka("Jarak tujuan (km) :");
        if (jarak == null) return;

        long kelipatanBerat = (long) Math.ceil(berat / 100.0);
        long kelipatanJarak = (long) Math.ceil(jarak / 10.0);
        long biaya = kelipatanBerat * HARGA_PER_100_GR + kelipatanJarak * HARGA_PER_10_KM;

        counterResi++;
        String resi = String.format("XYZ%04d", counterResi);

        ArrayList<String> baris = new ArrayList<String>();
        baris.add(resi);
        baris.add(barang);
        baris.add(String.valueOf(berat.longValue()));
        baris.add(String.valueOf(jarak.longValue()));
        baris.add(String.valueOf(biaya));
        dataPesanan.add(baris);

        JOptionPane.showMessageDialog(null,
                "Pesanan berhasil dibuat\n\n"
                + "No Resi : " + resi + "\n"
                + "Barang  : " + barang + "\n"
                + "Berat   : " + berat.longValue() + " gr\n"
                + "Jarak   : " + jarak.longValue() + " km\n"
                + "Biaya   : Rp " + String.format("%,d", biaya),
                JUDUL, JOptionPane.INFORMATION_MESSAGE);
    }

    static void trackingPesanan() {
        if (dataPesanan.isEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "Belum ada pesanan. Silakan Input Pesanan terlebih dahulu.",
                    JUDUL, JOptionPane.WARNING_MESSAGE);
            return;
        }

        String resi = bacaTeks("Masukkan nomor resi :");
        if (resi == null) return;

        for (ArrayList<String> baris : dataPesanan) {
            if (baris.get(0).equalsIgnoreCase(resi)) {
                JOptionPane.showMessageDialog(null,
                        "Data pesanan ditemukan\n\n"
                        + "No Resi : " + baris.get(0) + "\n"
                        + "Barang  : " + baris.get(1) + "\n"
                        + "Berat   : " + baris.get(2) + " gr\n"
                        + "Jarak   : " + baris.get(3) + " km\n"
                        + "Biaya   : Rp " + String.format("%,d", Long.parseLong(baris.get(4))),
                        JUDUL, JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Data tidak ditemukan", JUDUL,
                JOptionPane.ERROR_MESSAGE);
    }

    public static void main(String[] args) {
        while (true) {
            String menu = JOptionPane.showInputDialog(null,
                    "=== " + JUDUL + " ===\n\n"
                    + "1. Input Pesanan\n"
                    + "2. Tracking Pesanan\n\n"
                    + "Pilih menu (1/2) :",
                    JUDUL, JOptionPane.QUESTION_MESSAGE);

            if (menu == null) {                  
                if (konfirmasiKeluar()) {
                    break;
                }
                continue;
            }

            switch (menu.trim()) {
                case "1":
                    inputPesanan();
                    break;
                case "2":
                    trackingPesanan();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Masukan angka 1 atau 2", JUDUL,
                            JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}