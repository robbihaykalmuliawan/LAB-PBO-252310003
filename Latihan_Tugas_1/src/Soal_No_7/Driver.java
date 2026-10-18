package Soal_No_7;

public class Driver {
    private String idDriver;
    private String nama;
    private boolean statusTersedia;

    public Driver(String idDriver, String nama) {
        this.idDriver = idDriver;
        this.nama = nama;
        this.statusTersedia = true;
    }

    public void ambilPesanan(PesananFood p) {
        statusTersedia = false;
        System.out.println(nama + " mengambil pesanan, total Rp" + p.getTotalHarga());
    }

    public void selesaikanPesanan() {
        statusTersedia = true;
        System.out.println(nama + " selesai mengantar.");
    }
}