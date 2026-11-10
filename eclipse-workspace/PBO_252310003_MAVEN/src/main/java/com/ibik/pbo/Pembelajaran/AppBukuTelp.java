package com.ibik.pbo.Pembelajaran;

import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridLayout;

public class AppBukuTelp {

    public static void main(String[] args) {
        ArrayList<String> daftarNama = new ArrayList<String>();
        ArrayList<ArrayList<String>> bukuTelp = new ArrayList<ArrayList<String>>();

        int jumlahData = 3;
        for (int i = 1; i <= jumlahData; i++) {
            JTextField txtNama = new JTextField(20);
            JTextField txtAlamat = new JTextField(20);
            JTextField txtTelp = new JTextField(20);

            JPanel form = new JPanel(new GridLayout(3, 2, 5, 5));
            form.add(new JLabel("Nama Lengkap"));
            form.add(txtNama);
            form.add(new JLabel("Alamat"));
            form.add(txtAlamat);
            form.add(new JLabel("No Telp"));
            form.add(txtTelp);

            int pilihan = JOptionPane.showConfirmDialog(null, form,
                    "Form Buku Telepon - Data ke-" + i,
                    JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
            if (pilihan != JOptionPane.OK_OPTION) {
                break;
            }

            ArrayList<String> baris = new ArrayList<String>();
            baris.add(txtNama.getText());
            baris.add(txtAlamat.getText());
            baris.add(txtTelp.getText());

            bukuTelp.add(baris);
            daftarNama.add(txtNama.getText());
        }

        StringBuilder sb = new StringBuilder();
        sb.append("Daftar Nama (ArrayList 1 dimensi):\n");
        for (int i = 0; i < daftarNama.size(); i++) {
            sb.append(i + 1).append(". ").append(daftarNama.get(i)).append("\n");
        }
        sb.append("\nBuku Telepon (ArrayList multidimensi):\n");
        sb.append("Nama Lengkap | Alamat | No Telp\n");
        sb.append("--------------------------------------------\n");
        for (ArrayList<String> baris : bukuTelp) {
            sb.append(baris.get(0)).append(" | ")
              .append(baris.get(1)).append(" | ")
              .append(baris.get(2)).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString(), "Buku Telepon",
                JOptionPane.INFORMATION_MESSAGE);
    }
}