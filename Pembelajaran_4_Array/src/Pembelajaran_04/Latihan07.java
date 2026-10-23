package Pembelajaran_04;
import javax.swing.JOptionPane;

public class Latihan07 {
    public static void main(String[] args) {
        int[][] a = new int[2][2];
        int[][] b = new int[2][2];
        int[][] c = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Masukan nilai matrix A[" + i + "][" + j + "]:", "Input Matrix A",
                        JOptionPane.QUESTION_MESSAGE));
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                b[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Masukan nilai matrix B[" + i + "][" + j + "]:", "Input Matrix B",
                        JOptionPane.QUESTION_MESSAGE));
            }
        }

        long npm = Long.parseLong(
                JOptionPane.showInputDialog(null, "Masukan NPM kamu:", "Input NPM", JOptionPane.QUESTION_MESSAGE));
        boolean ganjil = npm % 2 != 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (ganjil) {
                    c[i][j] = a[i][j] + b[i][j];
                } else {
                    c[i][j] = a[i][j] - b[i][j];
                }
            }
        }

        String hasil = ganjil ? "NPM GANJIL: C = A + B\n\n" : "NPM GENAP: C = A - B\n\n";
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                hasil += c[i][j] + "  ";
            }
            hasil += "\n";
        }

        JOptionPane.showMessageDialog(null, hasil, "Output Matrix C", JOptionPane.INFORMATION_MESSAGE);
    }
}
