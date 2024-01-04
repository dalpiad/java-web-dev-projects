package org.launchcode;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        Comparator comparator = new FlavorComparator();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.
        flavors.sort(comparator);

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.
        cones.sort(new ConeComparator());

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
        System.out.print("All of our flavors: \n");

        for (Flavor flavor : flavors) {
            System.out.print(flavor.getName() + "\n");
        }

        System.out.print("\nThe cone options: \n");

        for (Cone cone : cones) {
            System.out.print(cone.getName() + ": " + cone.getCost() + "\n");
        }

        flavors.sort(new FlavorComparatorAllergens());

        System.out.print("\nFlavors sorted by number of Allergens: \n");

        for (Flavor flavor : flavors) {
            System.out.print(flavor.getName() + " has " + flavor.getAllergens().size() + " allergens\n");
        }

    }
}