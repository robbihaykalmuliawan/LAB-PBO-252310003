package Praktikum_3;

import javax.swing.JOptionPane;

public class App {
	public static void main(String[] args) {
		JOptionPane jop = new JOptionPane();
		
		String nama, npm;
		int umur;
		
		int confirm = 0;
		
		do {
			nama = JOptionPane.showInputDialog(
					null,
					"Masukan nama anda",
					"Input",
					JOptionPane.QUESTION_MESSAGE
					);
			confirm = JOptionPane.showConfirmDialog(
					null,
					"Apakah anda yakin nama anda " + nama 
					);
			if (confirm == 2) {
				return;
			}
		} while (confirm != 0);
		
		npm = jop.showInputDialog(
				null,
				"Input NPM",
				"252310003"
				);
		
		umur = Integer.parseInt(JOptionPane.showInputDialog(null, "Input umur"));		
	
		String output = "Nama: " + nama + "\n" +
						"Npm: " + npm + "\n" +
						"Umur: " + umur;
						
		jop.showMessageDialog(null, output, "Biodata", jop.ERROR_MESSAGE);
	}
}
