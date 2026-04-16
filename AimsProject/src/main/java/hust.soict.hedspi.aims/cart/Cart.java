package hust.soict.hedspi.aims.cart;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class Cart {
    public static final int MAX_NUMBERS_ORDER = 20;
    private DigitalVideoDisc itemsOrdered[] =
            new DigitalVideoDisc[MAX_NUMBERS_ORDER];
    private int qtyOrdered = 0;
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if(qtyOrdered >= MAX_NUMBERS_ORDER) {
            System.out.println("The cart is almost full");
            return;
        }

        itemsOrdered[qtyOrdered] = disc;
        qtyOrdered++;
        System.out.println("The disc has been added");
    }
    // Overloading by differing types of parameter
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        for(DigitalVideoDisc dvd : dvdList) {
            addDigitalVideoDisc(dvd);
        }
    }
    // Overloading by differing the number of parameters
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        addDigitalVideoDisc(dvd1);
        addDigitalVideoDisc(dvd2);
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        int index = -1;
        for(int i = 0; i < qtyOrdered; i ++) {
            if(itemsOrdered[i] == disc) {
                index = i;
                break;
            }
        }
        if(index == -1) {
            System.out.println("The disc was not found");
            return;
        }
        for(int i = index; i < qtyOrdered - 1; i ++) {
            itemsOrdered[i] = itemsOrdered[i + 1];
        }
        itemsOrdered[qtyOrdered - 1] = null;
        qtyOrdered--;

        System.out.println("The disc has been removed");
    }

    public float totalCost() {
        float total = 0.0f;
        for(int i = 0; i < qtyOrdered; i ++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }

    /**
     * public void printCart() {
     *         System.out.println("Cart Items:");
     *         for (int i = 0; i < qtyOrdered; i++) {
     *             DigitalVideoDisc disc = itemsOrdered[i];
     *             System.out.printf("%d\t%s\t%.2f\n", i + 1, disc.getTitle(), disc.getCost());
     *         }
     *         System.out.printf("\nTotal Cost\t%.2f\n", totalCost());
     *     }
     */
    public void searchById(int id) {
        boolean found = false;

        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getId() == id) {
                System.out.println("Result:");
                System.out.println(itemsOrdered[i].toString());
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

        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].isMatch(title)) {
                System.out.println(itemsOrdered[i].toString());
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

        for (int i = 0; i < qtyOrdered; i++) {
            System.out.printf("%d. %s\n", i + 1, itemsOrdered[i].toString());
        }

        System.out.printf("Total cost: %.2f $\n", totalCost());
        System.out.println("***************************************************");
    }
}
