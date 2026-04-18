package hust.soict.hedspi.aims;

import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.store.Store;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.media.Playable;
import java.util.Scanner;

public class Aims {
    static Store store = new Store();
    static Cart cart = new Cart();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        //Create a new cart
        Cart anOrder = new Cart();

        //Create new dvd objects and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
                "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addMedia(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
                "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addMedia(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
                "Animation",null, 0,  18.99f);
        anOrder.addMedia(dvd3);

        //print total cost of the items in the cart
        //System.out.println("Total Cost is: ");
        // System.out.println(anOrder.totalCost());

        /*anOrder.removeMedia(dvd1);
        System.out.println("Cart after removing : ");
        anOrder.printCart();
        */
         
        int choice;

        do {
            showMenu();
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    storeMenu();
                    viewStore();
                    break;
                case 2:
                    updateStore();
                    break;
                case 3:
                    cart.printCart();
                    cartMenu();
                    break;
                case 0:
                    System.out.println("Exit program!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 0);
    }

    // ================= MAIN MENU =================
    public static void showMenu() {
        System.out.println("AIMS:");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.print("Please choose: ");
    }

    // ================= STORE MENU =================
    public static void storeMenu() {
        System.out.println("Options:");
        System.out.println("--------------------------------");
        System.out.println("1. See a media’s details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.print("Choose: ");
    }

    // ================= MEDIA DETAILS MENU =================
    public static void mediaDetailsMenu() {
        System.out.println("Options:");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.print("Choose: ");
    }

    // ================= CART MENU =================
    public static void cartMenu() {
        System.out.println("Options:");
        System.out.println("--------------------------------");
        System.out.println("1. Filter media in cart");
        System.out.println("2. Sort media in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.print("Choose: ");
    }

    // ================= VIEW STORE =================
    public static void viewStore() {

        store.printStore();

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {

            case 1:
                System.out.print("Enter title: ");
                String title = scanner.nextLine();

                Media m = store.searchByTitle(title);
                if (m == null) {
                    System.out.println("Media not found!");
                    return;
                }

                System.out.println(m);

                mediaDetailsMenu();
                int c1 = scanner.nextInt();
                scanner.nextLine();

                if (c1 == 1) {
                    cart.addMedia(m);
                } else if (c1 == 2 && m instanceof Playable) {
                    ((Playable) m).play();
                }
                break;

            case 2:
                System.out.print("Enter title to add cart: ");
                String t2 = scanner.nextLine();

                Media m2 = store.searchByTitle(t2);
                if (m2 != null) {
                    cart.addMedia(m2);
                    System.out.println("Added to cart!");
                } else {
                    System.out.println("Not found!");
                }
                break;

            case 3:
                System.out.print("Enter title to play: ");
                String t3 = scanner.nextLine();

                Media m3 = store.searchByTitle(t3);
                if (m3 instanceof Playable) {
                    ((Playable) m3).play();
                } else {
                    System.out.println("Cannot play this media!");
                }
                break;

            case 4:
                cart.printCart();
                break;

            case 0:
                return;
        }
    }

    // ================= UPDATE STORE =================
    public static void updateStore() {

        System.out.println("1. Add media");
        System.out.println("2. Remove media");
        int c = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter title: ");
        String title = scanner.nextLine();

        if (c == 1) {
            store.addMedia(new DigitalVideoDisc(999, title, "Unknown", 0, 0));
            System.out.println("Added!");
        } else {
            store.removeByTitle(title);
            System.out.println("Removed!");
        }
    }

    // ================= CART MENU ACTIONS =================
    public static void handleCartMenu() {

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {

            case 1:
                System.out.print("Enter title filter: ");
                String t = scanner.nextLine();
                cart.filterByTitle(t);
                break;

            case 2:
                System.out.println("1. Sort by title");
                System.out.println("2. Sort by cost");
                int s = scanner.nextInt();

                if (s == 1) cart.sortByTitleCost();
                else cart.sortByCostTitle();

                break;

            case 3:
                System.out.print("Enter title to remove: ");
                String r = scanner.nextLine();
                cart.removeByTitle(r);
                break;

            case 4:
                System.out.print("Enter title to play: ");
                String p = scanner.nextLine();
                cart.playMedia(p);
                break;

            case 5:
                System.out.println("Order placed!");
                cart.clear();
                break;

            case 0:
                return;
        }
    }
}

