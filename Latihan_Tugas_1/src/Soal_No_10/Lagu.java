package Soal_No_10;

public class Lagu extends MediaAudio {
    private String artis;

    public Lagu(String judul, int durasi, String artis) {
        super(judul, durasi);
        this.artis = artis;
    }

    @Override
    public void putarAudio() {
        System.out.println("Memutar lagu: " + getJudul() + " - " + artis);
    }
}