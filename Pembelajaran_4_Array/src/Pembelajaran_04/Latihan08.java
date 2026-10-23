package Pembelajaran_04;
import javax.swing.JOptionPane;

public class Latihan08 {
    public static void main(String[] args) {
        String field[] = {"Nama Lengkap", "Alamat", "No Telp"};

        String[][] data = {
            {"Septian Cahyadi", "Dramaga cantik residance II, Bogor", "+62 899-9506-210"},
            {"Isnan Mulia", "Jl.Manunggal, Bogor", "+62 819-3208-0875"},
            {"Edi Nurachmand", "Taman Cimanggu Permai, Bogor", "+62 856-9380-0384"}
        };

        for (int i = 0; i < data.length; i++) {
            String hasil = "";
            for (int j = 0; j < field.length; j++) {
                hasil += field[j] + ": " + data[i][j] + "\n";
            }
            JOptionPane.showMessageDialog(null, hasil, "Data ke-" + (i + 1), JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
