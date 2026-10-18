package Soal_No_10;

public class SpotifyApp {
    public static void main(String[] args) {
        MediaAudio[] playlist = new MediaAudio[3];
        playlist[0] = new Lagu("Judul A", 210, "Artis X");
        playlist[1] = new Podcast("Episode 1", 1800, "Host Y");
        playlist[2] = new Lagu("Judul B", 195, "Artis Z");

        for (MediaAudio m : playlist) {
            m.putarAudio();
        }
    }
}