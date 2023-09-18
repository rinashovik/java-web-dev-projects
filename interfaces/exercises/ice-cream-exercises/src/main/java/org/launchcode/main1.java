package org.launchcode;

import java.util.ArrayList;
import java.util.Comparator;

public class main1 {
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();

        System.out.println("Before: " +flavors);


        ArrayList<Cone> cones = menu.getCones();
        System.out.println("Before: " +cones);
        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.
        Comparator comparator = new FlavorComparator();

        //flavors.sort(comparator); // or

        flavors.sort(new FlavorComparator());
        System.out.println("After: " + flavors);

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.

        cones.sort(new ConesComparator());

        System.out.println("After: " + cones);



        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.


    }
}