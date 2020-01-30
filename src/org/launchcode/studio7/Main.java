package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){




        CD Album = new CD ("LedZeppelin", 800.00, "Contains Music", "CD", 500.00, false);
        Album.storeData();
        System.out.println(Album.writeData());
        System.out.println(Album.readData());
        System.out.println(Album.reportInfo());
        System.out.println(Album.eject());
        System.out.println(Album.spin());
        System.out.println("\n");

        DVD Movie  = new DVD ("Goonies", 799.00, "Contains a Movie", "DVD", 450.00, false);
        Movie.storeData();
        System.out.println(Movie.writeData());
        System.out.println(Movie.readData());
        System.out.println(Movie.reportInfo());
        System.out.println(Movie.spin());
        System.out.println(Movie.eject());


        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.

    }
}









