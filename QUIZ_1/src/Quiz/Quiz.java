package Quiz;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Quiz {
    public static void main(String[] args) {
        ArrayList<String> buku = new ArrayList<>();
        int pilihan;

        do {
            pilihan = Integer.parseInt(JOptionPane.showInputDialog(
                    "MENU\n1. Input buku\n2. Hapus buku\n3. Tampilkan data buku\n4. Keluar"));

            if (pilihan == 1) {
                String judul = JOptionPane.showInputDialog("Masukkan judul buku:");
                buku.add(judul);
                JOptionPane.showMessageDialog(null, "Buku berhasil disimpan");
            } else if (pilihan == 2) {
                int index = Integer.parseInt(JOptionPane.showInputDialog("Masukkan index buku yang ingin dihapus:"));
                if (index >= 0 && index < buku.size()) {
                    buku.remove(index);
                    JOptionPane.showMessageDialog(null, "Buku berhasil dihapus");
                } else {
                    JOptionPane.showMessageDialog(null, "Index tidak ditemukan");
                }
            } else if (pilihan == 3) {
                String hasil = "Data Buku:\n";
                for (int i = 0; i < buku.size(); i++) {
                    hasil += i + ". " + buku.get(i) + "\n";
                }
                JOptionPane.showMessageDialog(null, hasil);
            } else if (pilihan == 4) {
                JOptionPane.showMessageDialog(null, "Keluar dari program");
            } else {
                JOptionPane.showMessageDialog(null, "Menu tidak valid");
            }
        } while (pilihan != 4);
    }
}