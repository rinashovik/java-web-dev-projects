package org.launchcode;

import org.launchcode.Flavor;

import java.util.Comparator;

public class FlavorComparator implements Comparator<Flavor>{

    @Override
    public int compare(Flavor o1, Flavor o2) {
        //return 01.getName().compareTo(02.getName());
        return o1.getName().compareTo(o2.getName());
    }
}
