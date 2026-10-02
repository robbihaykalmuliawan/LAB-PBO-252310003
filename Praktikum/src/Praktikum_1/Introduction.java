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
		
		// operator perbandingan
		boolean pembanding = angka1 > angka2;
		boolean tesNama = nama == "Jaden";
	
		// operator kondisional 
		boolean kondisional = (true || false) && (true && true);
		
		// operator assigment
		angka1 *= angka2; // angka1 dikali dgn angka2
							// hasilnya disimpan di angka1
		
		Dog mydog = new Dog();
		mydog.hungry();
		String name = "Toni";
		mydog.puppyName(name);
		
	}
}
