package Soal_No_9;

public class Lagu extends MediaAudio {
    private String artis;

    public Lagu(String judul, String artis) {
        super(judul);
        this.artis = artis;
    }

    @Override
    public void putarAudio() {
        System.out.println("Memutar lagu: " + getJudul() + " - " + artis);
    }
}