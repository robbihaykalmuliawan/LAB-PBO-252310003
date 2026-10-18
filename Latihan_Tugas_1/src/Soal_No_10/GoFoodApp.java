package Soal_No_10;

public class GoFoodApp {
    public static void main(String[] args) {
        PesananFood pesanan = new PesananFood("GF-001", "Nasi Goreng");
        pesanan.tambahItem(25000, 2);
        pesanan.tambahItem(8000, 1);

        Driver driver = new Driver("D-01", "Budi");
        pesanan.tampilkanInfo();
        driver.ambilPesanan(pesanan);
        pesanan.tampilkanInfo();
        driver.selesaikanPesanan();
    }
}