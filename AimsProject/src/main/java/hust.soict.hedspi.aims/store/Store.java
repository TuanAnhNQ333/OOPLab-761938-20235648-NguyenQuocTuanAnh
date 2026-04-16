package hust.soict.hedspi.aims.store;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class Store {
    public static final int MAX_NUMBERS_ORDER = 20;
    private DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[MAX_NUMBERS_ORDER];
    private int qtyOrdered = 0;

    public void addDVD(DigitalVideoDisc disc) {
        if(qtyOrdered >= MAX_NUMBERS_ORDER) {
            System.out.println("The cart is almost full");
            return;
        }

        itemsInStore[qtyOrdered] = disc;
        qtyOrdered++;
        System.out.println("The disc has been added");
    }
    public void removeDVD(DigitalVideoDisc disc) {
        int index = -1;
        for(int i = 0; i < qtyOrdered; i ++) {
            if(itemsInStore[i] == disc) {
                index = i;
                break;
            }
        }
        if(index == -1) {
            System.out.println("The disc was not found");
            return;
        }
        for(int i = index; i < qtyOrdered - 1; i ++) {
            itemsInStore[i] = itemsInStore[i + 1];
        }
        itemsInStore[qtyOrdered - 1] = null;
        qtyOrdered--;

        System.out.println("The disc has been removed");
    }
}
