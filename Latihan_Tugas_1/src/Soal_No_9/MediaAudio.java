package Soal_No_9;

public abstract class MediaAudio {
    private String judul;

    public MediaAudio(String judul) { this.judul = judul; }
    public String getJudul() { return judul; }

    public abstract void putarAudio();
}