package hust.soict.hedspi.aims.media;

public class Track {
    protected String title;
    private int length;

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Track)) return false;
        Track other = (Track) obj;
        return title != null && title.equals(other.title) && length == other.length;
    }

    @Override
    public String toString() {
        return title + " (" + length + ")";
    }


    public void play() {
        System.out.println("Playing DVD: " + title);
        System.out.println("DVD length: " + length);
    }
}