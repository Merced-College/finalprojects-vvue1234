import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ArtistGame {
    // Loads artists from .csv file
    public ArrayList<String> loadArtists(String filePath) {
        ArrayList<String> artists = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("data.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                artists.add(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
        return artists;
    }

    public static void main (String args[]) {

        // Greets the user
        System.out.println("Welcome to the Artist Game!");
        System.out.println("You will be given some information about an artist, and you have to guess their name.");
        System.out.println("You can type 'exit' at any time to quit the game.");
        System.out.println("Let's get started!");
        Scanner scanner = new Scanner(System.in);

    }

    public static void getRandomArtist(ArrayList<String> artists) {
        // Selects a random artist from the list
        Random random = new Random();
        int index = random.nextInt(artists.size());
        

    }


}
   