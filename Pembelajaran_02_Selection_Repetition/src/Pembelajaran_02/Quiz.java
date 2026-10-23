package Quiz;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Quiz {
    public static void main(String[] args) {
        ArrayList<String> daftarBuku = new ArrayList<>();
        int pilihan = 0;
 
        do {
            String teksMenu = JOptionPane.showInputDialog(Parentcomponent:null,
                    "=== MENU ===\n"
                    + "1. Input buku\n"
                    + "2. Hapus buku\n"
                    + "3. Tampilkan seluruh data buku\n"
                    + "4. Keluar dari program\n\n"
                    + "Pilih menu (1-4):",
                    "Manajemen Buku", JOptionPane.QUESTION_MESSAGE);

            if (teksMenu == null) {
                pilihan = 4;
                continue;
            }

            try {
                pilihan = Integer.parseInt(teksMenu.trim());
            } catch (NumberFormatException e) {
                pilihan = 0;
            }

            switch (pilihan) {
                case 1:
                    String judul = JOptionPane.showInputDialog(null,
                            "Masukkan judul buku:", "Input Buku",
                            JOptionPane.QUESTION_MESSAGE);
                    if (judul != null && !judul.trim().isEmpty()) {
                        daftarBuku.add(judul.trim());
                        JOptionPane.showMessageDialog(null, "Buku berhasil disimpan.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Judul tidak boleh kosong.",
                                "Peringatan", JOptionPane.WARNING_MESSAGE);
                    }
                    break;

                case 2:
                    if (daftarBuku.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Belum ada data buku.");
                        break;
                    }
                    String teksIndex = JOptionPane.showInputDialog(null,
                            "Masukkan index buku yang ingin dihapus:", "Hapus Buku",
                            JOptionPane.QUESTION_MESSAGE);
                    if (teksIndex == null) {
                        break;
                    }
                    try {
                        int index = Integer.parseInt(teksIndex.trim());
                        if (index >= 0 && index < daftarBuku.size()) {
                            String dihapus = daftarBuku.remove(index);
                            JOptionPane.showMessageDialog(null,
                                    "Buku \"" + dihapus + "\" berhasil dihapus.");
                        } else {
                            JOptionPane.showMessageDialog(null, "Index tidak valid.",
                                    "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Input harus berupa angka.",
                                "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break;

                case 3:
                    if (daftarBuku.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Belum ada data buku.");
                    } else {
                        StringBuilder sb = new StringBuilder("Daftar Buku:\n\n");
                        for (int i = 0; i < daftarBuku.size(); i++) {
                            sb.append("[").append(i).append("] ")
                              .append(daftarBuku.get(i)).append("\n");
                        }
                        JOptionPane.showMessageDialog(null, sb.toString(),
                                "Data Buku", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;

                case 4:
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Menu tidak valid, coba lagi.",
                            "Error", JOptionPane.ERROR_MESSAGE);
            }
        } while (pilihan != 4);

        JOptionPane.showMessageDialog(null, "Keluar dari program. Terima kasih!");
    }
}