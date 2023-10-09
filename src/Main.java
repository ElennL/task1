import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Playing guitarPlay = new GuitarPlay();
        Playing pianoPlay = new PianoPlay();
        Playing drumsPlay = new DrumsPlay();

        Musician musician = new Musician();
        Scanner sc = new Scanner(System.in);

        String input = "";
        while (input.isEmpty()) {
            System.out.println("Choose an instrument: Piano, Guitar or Drums");
            input = sc.nextLine();
        }

        switch (input.toLowerCase()) {
            case "piano":
                musician.setPlaying(pianoPlay);
                break;
            case "guitar":
                musician.setPlaying(guitarPlay);
                break;
            case "drums":
                musician.setPlaying(drumsPlay);
                break;
            default:
                System.out.println("You didnt choose an instrument. By default it is guitar.");
        }

        musician.playMusic();
        sc.close();
    }
}
