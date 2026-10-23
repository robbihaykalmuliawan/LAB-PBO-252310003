package Soal_No_7;

public class PesananFood {
    private String idPesanan;
    public String getIdPesanan() {
        return idPesanan;
    }

    public void setIdPesanan(String idPesanan) {
        this.idPesanan = idPesanan;
    }

    private String namaMenu;
    public String getNamaMenu() {
        return namaMenu;
    }

    public void setNamaMenu(String namaMenu) {
        this.namaMenu = namaMenu;
    }

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