package Soal_No_10;

public class Podcast extends MediaAudio {
    private String host;

    public Podcast(String judul, int durasi, String host) {
        super(judul, durasi);
        this.host = host;
    }

    @Override
    public void putarAudio() {
        System.out.println("Memutar podcast: " + getJudul() + " oleh " + host);
    }
}