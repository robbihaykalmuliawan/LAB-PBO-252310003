package Soal_No_10;

public class Driver {
    private String idDriver;
    private String nama;
    private boolean statusTersedia;

    public Driver(String idDriver, String nama) {
        this.idDriver = idDriver;
        this.nama = nama;
        this.statusTersedia = true;
    }

    public void ambilPesanan(PesananFood pesanan) {
        if (!statusTersedia) {
            System.out.println(nama + " sedang mengantar pesanan lain.");
            return;
        }
        statusTersedia = false;
        pesanan.setDriver(this);
        System.out.println("Driver " + nama + " mengambil pesanan " + pesanan.getIdPesanan());
    }

    public void selesaikanPesanan() {
        statusTersedia = true;
        System.out.println("Driver " + nama + " selesai mengantar.");
    }

    public String getNama() { return nama; }
}