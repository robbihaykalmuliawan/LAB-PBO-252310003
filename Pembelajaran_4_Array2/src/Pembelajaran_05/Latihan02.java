package Pembelajaran_05;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Latihan02 {

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

        ArrayList<ArrayList<Integer>> C = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            ArrayList<Integer> baris = new ArrayList<>();
            for (int j = 0; j < 2; j++) {
                int jumlah = 0;
                for (int k = 0; k < 2; k++) {
                    jumlah += A.get(i).get(k) * B.get(k).get(j);
                }
                baris.add(jumlah);
            }
            C.add(baris);
        }

        JOptionPane.showMessageDialog(null,
                toText("A", A) + "\n" + toText("B", B) + "\n" + toText("C = A * B", C),
                "Hasil Perkalian Matrix", JOptionPane.INFORMATION_MESSAGE);
    }
}