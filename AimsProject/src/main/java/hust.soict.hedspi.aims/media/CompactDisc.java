package hust.soict.hedspi.aims.media;

public class CompactDisc extends Disc{

    public CompactDisc(int length, String director) {
        super(length, director);
    }

    public CompactDisc(int id, String title, String category, float cost, int length, String director) {
        super(id, title, category, cost, length, director);
    }
}
