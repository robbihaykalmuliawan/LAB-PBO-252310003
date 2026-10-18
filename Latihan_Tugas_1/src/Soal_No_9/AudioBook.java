package Soal_No_9;

public class AudioBook extends MediaAudio {
    private String penulis;

    public AudioBook(String judul, String penulis) {
        super(judul);
        this.penulis = penulis;
    }

    @Override
    public void putarAudio() {
        System.out.println("Memutar audiobook: " + getJudul() + " karya " + penulis);
    }
}