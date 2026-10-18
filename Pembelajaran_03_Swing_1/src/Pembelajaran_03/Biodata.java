package Pembelajaran_03;

public class Biodata {
    private String fullname;
    private String usia;
    private String alamat;

    public void simpan(String fullname, String usia, String alamat) {
        this.fullname = fullname;
        this.usia = usia;
        this.alamat = alamat;
    }

    public String getFullname() { return fullname; }
    public String getUsia() { return usia; }
    public String getAlamat() { return alamat; }
}