package hust.soict.hedspi.aims.store;

import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.cart.Cart;
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

    // Print all media in store
    public void printStore() {
        System.out.println("************* STORE *************");
        if (itemsOrdered.isEmpty()) {
            System.out.println("The store is empty");
            return;
        }

        int i = 1;
        for (Media media : itemsOrdered) {
            System.out.println(i + ". " + media.toString());
            i++;
        }
        System.out.println("*********************************");
    }

    // Search by title
    public Media searchByTitle(String title) {
        for (Media media : itemsOrdered) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                return media;
            }
        }
        return null; // không tìm thấy
    }

    // Remove by title
    public void removeByTitle(String title) {
        Media media = searchByTitle(title);
        if (media != null) {
            itemsOrdered.remove(media);
            System.out.println("The media has been removed");
        } else {
            System.out.println("The media was not found");
        }
    }
}
