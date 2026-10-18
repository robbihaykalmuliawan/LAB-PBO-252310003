package Pembelajaran_03;

import javax.swing.JOptionPane;

public class Latihan02 {
    public static void main(String[] args) {
        Biodata bio = new Biodata();

       
        String fullname = JOptionPane.showInputDialog(null, "Masukkan fullname:",
                "Input Fullname", JOptionPane.QUESTION_MESSAGE);
        String usia = JOptionPane.showInputDialog(null, "Masukkan usia:",
                "Input Usia", JOptionPane.QUESTION_MESSAGE);
        String alamat = JOptionPane.showInputDialog(null, "Masukkan alamat:",
                "Input Alamat", JOptionPane.QUESTION_MESSAGE);

        bio.simpan(fullname, usia, alamat);

        JOptionPane.showMessageDialog(null,
                "Fullname : " + bio.getFullname() + "\n"
                + "Usia     : " + bio.getUsia() + "\n"
                + "Alamat   : " + bio.getAlamat(),
                "Data Biodata", JOptionPane.INFORMATION_MESSAGE);
    }
}