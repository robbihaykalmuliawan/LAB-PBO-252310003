package Pembelajaran_05;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Latihan04 {

    public static void main(String[] args) {
        ArrayList<ArrayList<String>> data = new ArrayList<>();
        int jumlahData = 3;

        for (int i = 0; i < jumlahData; i++) {
            ArrayList<String> baris = new ArrayList<>();
            baris.add(JOptionPane.showInputDialog("Data ke-" + (i + 1) + "\nNama Lengkap :"));
            baris.add(JOptionPane.showInputDialog("Data ke-" + (i + 1) + "\nAlamat :"));
            baris.add(JOptionPane.showInputDialog("Data ke-" + (i + 1) + "\nNo Telp :"));
            data.add(baris);
        }

        data.sort((a, b) -> a.get(0).compareToIgnoreCase(b.get(0)));

        StringBuilder sb = new StringBuilder();
        sb.append("Data (Ascending berdasarkan Nama Lengkap)\n");
        sb.append("Nama Lengkap | Alamat | No Telp\n");
        sb.append("--------------------------------------------\n");
        for (ArrayList<String> baris : data) {
            sb.append(baris.get(0)).append(" | ")
              .append(baris.get(1)).append(" | ")
              .append(baris.get(2)).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString(), "Hasil Sorting",
                JOptionPane.INFORMATION_MESSAGE);
    }
}