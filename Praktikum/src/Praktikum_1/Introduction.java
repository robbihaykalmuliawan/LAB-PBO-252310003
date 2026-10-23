package Praktikum_1;

public class Introduction {
	public static void main(String[] args) {
		System.out.println("Hello World");
	
		// variabel
		int angka1 = 10;
		int angka2 = 20;
		
		// tipe data
		String nama = "Jaden";
		
		// operator
	int hasilTambah = angka1 + angka2; // pertambahan
	hasilTambah++; // increment
	System.out.println("Hasil tambah: " + hasilTambah);

		// operator perbandingan
	boolean pembanding = angka1 > angka2;
	boolean tesNama = nama.equals("Jaden");
	System.out.println("Pembanding: " + pembanding);
	System.out.println("Tes nama: " + tesNama);

// operator kondisional
	boolean kondisional = (angka1 > 5 || angka2 < 0) && (angka1 > 0 && angka2 > 0);
	System.out.println("Kondisional: " + kondisional);
		
	Dog mydog = new Dog();
	mydog.hungry();
	String name = "Toni";
		mydog.puppyName(name);
		
	}
}
