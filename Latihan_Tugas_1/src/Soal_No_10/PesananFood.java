package Soal_No_10;

public class PesananFood {
    private String idPesanan;
    private String namaMenu;
    private double totalHarga;
    private Driver driver;   // asosiasi ke Driver

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
    public String getIdPesanan() { return idPesanan; }
    public void setDriver(Driver driver) { this.driver = driver; }

    public void tampilkanInfo() {
        System.out.println("Pesanan " + idPesanan + " (" + namaMenu + ") total Rp" + totalHarga
            + ", driver: " + (driver != null ? driver.getNama() : "belum ada"));
    }
}