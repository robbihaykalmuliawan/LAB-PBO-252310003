package Pembelajaran_04;
import javax.swing.JOptionPane;

public class Latihan03 {
    public static void main(String[] args) {
        int jumlah = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Masukan jumlah array:", "Input", JOptionPane.QUESTION_MESSAGE));

        int[] nilai = new int[jumlah];

        for (int i = 0; i < nilai.length; i++) {
            nilai[i] = Integer.parseInt(
                    JOptionPane.showInputDialog(null, "Masukan angka:", "Data array ke-" + i,
                            JOptionPane.QUESTION_MESSAGE));
        }

        String hasil = "";
        for (int i = 0; i < nilai.length; i++) {
            hasil += "x[" + i + "]=" + nilai[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, hasil, "Output Array", JOptionPane.INFORMATION_MESSAGE);
    }
}
