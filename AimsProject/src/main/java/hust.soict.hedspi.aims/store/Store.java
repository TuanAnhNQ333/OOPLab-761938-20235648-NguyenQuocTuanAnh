package hust.soict.hedspi.aims.store;

import hust.soict.hedspi.aims.media.Media;
import java.util.ArrayList;

public class Store {
    public static final int MAX_NUMBERS_ORDER = 20;
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
    private int qtyOrdered = 0;

    public void addMedia(Media media) {
        if(itemsOrdered.size() >= MAX_NUMBERS_ORDER){
            System.out.println("The cart is almost full");
        }
        itemsOrdered.add(media);
        System.out.println("The media has been added");
    }
    public void removeMedia(Media media) {
        if(itemsOrdered.remove(media)) {
            System.out.println("The media has been deleted");
        } else {
            System.out.println("The media was not found");
        }
    }
}
