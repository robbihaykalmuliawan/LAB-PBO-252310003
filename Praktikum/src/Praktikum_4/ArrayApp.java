package Praktikum_4;

import java.util.Scanner;

public class ArrayApp {
	public static void main(String[] args) {
		String[] nama = new String[4];
		nama[0] = "Sajidah"; 			// cara input
		System.out.println(nama[0]); 	// cara output
		System.out.println(nama[1]); 	// tes output
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input nama: ");
		nama[1] = scanner.nextLine();
		System.out.println("Nama yang dioutput: " + nama[1]);
	
		System.out.println("Nama-nama:");
		for (int i = 0; i < 4; i++) {
			System.out.println(nama[i]);
			
		}
	}
}