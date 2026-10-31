package Pembelajaran_05;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Latihan01 {
    static ArrayList<ArrayList<Integer>> inputMatrix(String nama) {
        ArrayList<ArrayList<Integer>> m = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            ArrayList<Integer> baris = new ArrayList<>();
            for (int j = 0; j < 2; j++) {
                String s = JOptionPane.showInputDialog(
                        "Matrix " + nama + " [" + (i + 1) + "][" + (j + 1) + "] :");
                baris.add(Integer.parseInt(s));
            }
            m.add(baris);
        }
        return m;
    }

    static String toText(String nama, ArrayList<ArrayList<Integer>> m) {
        StringBuilder sb = new StringBuilder("Matrix " + nama + ":\n");
        for (ArrayList<Integer> baris : m) {
            for (int v : baris) sb.append(v).append("\t");
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> A = inputMatrix("A");
        ArrayList<ArrayList<Integer>> B = inputMatrix("B"); 

        JOptionPane.showMessageDialog(null,
                toText("A", A) + "\n" + toText("B", B),
                "Hasil Output", JOptionPane.INFORMATION_MESSAGE);
    }
}