package Soal_No_7;

public class PesananFood {
    private String idPesanan;
    private String namaMenu;
    private double totalHarga;

    public PesananFood(String idPesanan, String namaMenu) {
        this.idPesanan = idPesanan;
        this.namaMenu = namaMenu;
        this.totalHarga = 0;
    }

    public void tambahItem(double harga, int jumlah) {
        if (harga <= 0 || jumlah <= 0) {
            System.out.println("Harga/jumlah tidak valid!");
            return;
        }
        totalHarga += harga * jumlah;
    }

    public double getTotalHarga() { return totalHarga; }
}