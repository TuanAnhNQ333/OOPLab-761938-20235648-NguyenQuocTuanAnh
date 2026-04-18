package hust.soict.hedspi.aims.media;

public class DigitalVideoDisc extends Disc implements Playable{
    private static int nbDigitalVideoDiscs = 0;
    public static int getNbDigitalVideoDiscs() {
        return nbDigitalVideoDiscs;
    }
    // constructors :
    public DigitalVideoDisc(String title) {
        this(title, null, null, 0, 0.0f);
    }
    public DigitalVideoDisc(String title, String category, float cost) {
        this(title, category, null, 0, cost);
    }
    public DigitalVideoDisc(String title, String category, String director, float cost) {
        this(title, category, director, 0, cost);
    }
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(++nbDigitalVideoDiscs, title, category, cost, length, director);
    }
    public DigitalVideoDisc(int id, String title, String category, int length, float cost) {
        super(id, title, category, cost, length, null);
    }

    @Override
    public String toString() {
        return "DVD - " + getTitle() + " - " + getCategory()
                + " - " + getDirector() + " - " + getLength()
                + ": " + getCost() + " $";
    }

    public boolean isMatch(String title) {
        if (getTitle() == null) return false;
        return getTitle().toLowerCase().contains(title.toLowerCase());
    }

    
    public void play() {
        System.out.println("Playing DVD: " + getTitle());
        System.out.println("DVD length: " + getLength());
    }

}
