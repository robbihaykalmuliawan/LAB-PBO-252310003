package Pembelajaran_03;

import javax.swing.JOptionPane;

public class Latihan04 {

    private static boolean konfirmasiKeluar() {
        int pilih = JOptionPane.showConfirmDialog(null,
                "Apakah anda ingin keluar ?", "Konfirmasi",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        return pilih == JOptionPane.YES_OPTION;
    }

    private static String minta(String field) {
        while (true) {
            String input = JOptionPane.showInputDialog(null,
                    "Masukkan " + field + ":", "Input " + field,
                    JOptionPane.QUESTION_MESSAGE);

            if (input == null) {
                if (konfirmasiKeluar()) {
                    System.exit(0);       
                }
                continue;                 
            }

            input = input.trim();

            if (input.isEmpty()) {
                JOptionPane.showMessageDialog(null,
                        "Field " + field + " tidak boleh kosong",
                        "Error", JOptionPane.ERROR_MESSAGE);
                continue;
            }

            if (field.equals("usia") && !input.matches("\\d+")) {
                JOptionPane.showMessageDialog(null,
                        "Isian usia harus angka",
                        "Error", JOptionPane.ERROR_MESSAGE);
                continue;
            }

            if (field.equals("alamat") && input.length() < 10) {
                JOptionPane.showMessageDialog(null,
                        "Masukan alamat minimum 10 karakter",
                        "Warning", JOptionPane.WARNING_MESSAGE);
                continue;
            }

            return input;
        }
    }

    public static void main(String[] args) {
        Biodata bio = new Biodata();

        String fullname = minta("fullname");
        String usia = minta("usia");
        String alamat = minta("alamat");

        bio.simpan(fullname, usia, alamat);

        JOptionPane.showMessageDialog(null,
                "Fullname : " + bio.getFullname() + "\n"
                + "Usia     : " + bio.getUsia() + "\n"
                + "Alamat   : " + bio.getAlamat(),
                "Info", JOptionPane.INFORMATION_MESSAGE);
    }
}