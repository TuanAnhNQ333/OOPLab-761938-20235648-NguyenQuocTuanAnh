package hust.soict.hedspi.aims.media;

import java.util.Comparator;
public abstract class Media {

    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();

    protected int id;
    protected String title;
    protected String category;
    protected float cost;

    public Media() {}

    public Media(int id, String title, String category, float cost) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    // getters & setters
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public float getCost() {
        return cost;
    }
    public void setCost(float cost) {
        this.cost = cost;
    }
    @Override
    public String toString() {
        return title + " - " + category + " - " + cost + " $";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Track)) return false;
        Track other = (Track) o;
        return title != null && title.equals(other.title) ;
    }
    public boolean isMatch(String title) {
        if (getTitle() == null) return false;
        return getTitle().toLowerCase().contains(title.toLowerCase());
    }

}
