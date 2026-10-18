package Soal_No_7;

public class Main {
    public static void main(String[] args) {
        PesananFood p = new PesananFood("GF-001", "Nasi Goreng");
        p.tambahItem(25000, 2);
        p.tambahItem(8000, 1);
        System.out.println("Total: Rp" + p.getTotalHarga());   // 58000.0

        // p.totalHarga = 0;   // ERROR karena private (bukti enkapsulasi)

        Driver d = new Driver("D-01", "Budi");
        d.ambilPesanan(p);
        d.selesaikanPesanan();
    }
}