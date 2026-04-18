package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;

public class MediaTest {
    public static void main(String[] args) {
        List<Media> mediae = new ArrayList<Media>();
        // create new Book
        mediae.add(new Book(1, "Clean Code", "Programming", 29.99f));
        mediae.add(new Book(2, "Effective Java", "Programming", 35.50f));
        mediae.add(new Book(3, "Design Patterns", "Software Engineering", 40.00f));
        mediae.add(new Book(4, "Atomic Habits", "Self-help", 15.99f));

        // Create new DVD
        mediae.add(new DigitalVideoDisc(5, "Inception", "Sci-Fi", 148, 19.99f));
        mediae.add(new DigitalVideoDisc(6, "Interstellar", "Sci-Fi", 169, 24.99f));
        mediae.add(new DigitalVideoDisc(7, "The Dark Knight", "Action", 152, 21.50f));
        mediae.add(new DigitalVideoDisc(8, "Avengers: Endgame", "Action", 181, 25.00f));

        // Create new CD
        mediae.add(new CompactDisc(9, "Thriller", "Music", 42,140, "Michael Jackson", "Pop"));
        mediae.add(new CompactDisc(10, "Back in Black", "Music", 41,128, "AC/DC", "Rock"));
        mediae.add(new CompactDisc(11, "Divide", "Music", 46,96, "Ed Sheeran", "Pop"));
        mediae.add(new CompactDisc(12, "25", "Music", 48,102, "Adele", "Pop"));

        for (Media media : mediae) {
            System.out.println(media.toString());
        }

    }
}
