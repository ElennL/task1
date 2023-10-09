public class Musician {
    private Playing playing;

    Musician() {
        this.playing = new GuitarPlay();
    }

    public void setPlaying(Playing playing) {
        this.playing = playing;
    }

    public void playMusic() {
        playing.play();
    }
}
