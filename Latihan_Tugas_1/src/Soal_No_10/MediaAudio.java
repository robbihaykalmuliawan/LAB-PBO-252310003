package Soal_No_10;

public abstract class MediaAudio {
    private String judul;
    private int durasiDetik;

    public MediaAudio(String judul, int durasiDetik) {
        this.judul = judul;
        this.durasiDetik = durasiDetik;
    }

    public String getJudul() { return judul; }
    public int getDurasiDetik() { return durasiDetik; }

    public abstract void putarAudio();
}