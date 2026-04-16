package hust.soict.hedspi.aims.disc;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class TestPassingParameter {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        hust.soict.hedspi.aims.disc.DigitalVideoDisc jungleDVD = new hust.soict.hedspi.aims.disc.DigitalVideoDisc("Jungle");
        hust.soict.hedspi.aims.disc.DigitalVideoDisc cinderellaDVD = new hust.soict.hedspi.aims.disc.DigitalVideoDisc("Cinderella");

        swap(jungleDVD, cinderellaDVD);
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
        System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());

        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
    }

    public static void swap(Object o1, Object o2) {
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
    }

    public static void changeTitle(hust.soict.hedspi.aims.disc.DigitalVideoDisc dvd, String title) {
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);
    }
}
