package Soal_No_9;

public class Podcast extends MediaAudio {
    private String host;

    public Podcast(String judul, String host) {
        super(judul);
        this.host = host;
    }

    @Override
    public void putarAudio() {
        System.out.println("Memutar podcast: " + getJudul() + " oleh " + host);
    }
}