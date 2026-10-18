package Soal_No_9;

public class Main {
    public static void main(String[] args) {
        MediaAudio[] playlist = new MediaAudio[3];
        playlist[0] = new Lagu("Judul A", "Artis X");
        playlist[1] = new Podcast("Episode 1", "Host Y");
        playlist[2] = new AudioBook("Laskar Pelangi", "Andrea Hirata");

        for (MediaAudio m : playlist) {
            m.putarAudio();   // polimorfisme / dynamic binding
        }
    }
}