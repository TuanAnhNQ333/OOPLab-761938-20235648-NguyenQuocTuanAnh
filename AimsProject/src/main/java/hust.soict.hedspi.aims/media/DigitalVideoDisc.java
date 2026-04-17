package hust.soict.hedspi.aims.media;


public class DigitalVideoDisc extends Disc {
    /**
     * tittle, category, director,
     * int length
     * float cost
     */
    private int length;
    private String director;


    private static int nbDigitalVideoDiscs = 0;

    public static int getNbDigitalVideoDiscs() {
        return nbDigitalVideoDiscs;
    }

    // getters & setters
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }

    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
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

    @Override
    public String toString() {
        return "DVD - " + getTitle() + " - " + getCategory() + " - "
                + director + " - " + length + ": " + getCost() + " $";
    }

    public boolean isMatch(String title) {
        if (getTitle() == null) return false;
        return getTitle().toLowerCase().contains(title.toLowerCase());
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(++nbDigitalVideoDiscs, title, category, cost);
        this.director = director;
        this.length = length;
    }


}
