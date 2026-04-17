package hust.soict.hedspi.aims.cart;

import java.util.ArrayList;
import hust.soict.hedspi.aims.media.Media;

public class Cart {
    public static final int MAX_NUMBERS_ORDER = 20;
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();

    public void addMedia(Media media) {
        if(itemsOrdered.size() >= MAX_NUMBERS_ORDER) {
            System.out.println("The cart is almost full");
            return;
        }
        itemsOrdered.add(media);
        System.out.println("The media has been added");
    }
    public void removeMedia(Media media) {
        if(itemsOrdered.remove(media)) {
            System.out.println("The media has been removed");
        } else {
            System.out.println("The media was not found");
        }
    }
    public float totalCost() {
        float total = 0.0f;
        for(Media m :  itemsOrdered) {
            total += m.getCost();
        }
        return total;
    }

    public void searchById(int id) {
        boolean found = false;

        for (Media m :  itemsOrdered) {
            if (m.getId() == id) {
                System.out.println("Result:");
                System.out.println(m.toString());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No DVD found with id: " + id);
        }
    }
    public void searchByTitle(String title) {
        boolean found = false;

        System.out.println("Search results:");

        for (Media m : itemsOrdered) {
            if (m.isMatch(title)) {
                System.out.println(m.toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No DVD found with title: " + title);
        }
    }
    public void printCart() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        int i = 1;
        for (Media m : itemsOrdered) {
            System.out.printf("%d. %s\n", i++, m.toString());
        }

        System.out.printf("Total cost: %.2f $\n", totalCost());
        System.out.println("***************************************************");
    }
}
