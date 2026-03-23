package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Mobile implements Comparable<Mobile> {
    private String name;
    private int ram;
    private int prices;

    public Mobile(String name, int ram, int prices) {
        this.name = name;
        this.ram = ram;
        this.prices = prices;
    }

    public String getName() {
        return name;
    }

    public int getRam() {
        return ram;
    }

    public int getPrices() {
        return prices;
    }

    // Comparable (default sorting by price)
    public int compareTo(Mobile o) {
        if (this.prices > o.getPrices()) {
            return 1;
        } else if (this.prices < o.getPrices()) {
            return -1;
        } else {
            return 0;
        }
    }
}

// Comparator (also by price, but correct now)
class PriceCompare implements Comparator<Mobile> {
    public int compare(Mobile m1, Mobile m2) {
        if (m1.getPrices() < m2.getPrices()) return -1;
        if (m1.getPrices() > m2.getPrices()) return 1;
        return 0;
    }
}

public class ComparableClass {
    public static void main(String[] args) {

        List<Mobile> mobileList = new ArrayList<>();

        mobileList.add(new Mobile("RedMe", 16, 100));
        mobileList.add(new Mobile("Apple", 5, 100));
        mobileList.add(new Mobile("Samsung", 4, 600));

        // Using Comparable
        Collections.sort(mobileList);

        System.out.println("Mobiles after sorting:");
        System.out.println("Name\tRam\tPrice");

        for (Mobile mb : mobileList) {
            System.out.println(mb.getName() + "\t" +
                               mb.getRam() + "\t" +
                               mb.getPrices());
        }

        //Comparator instead:
        // Collections.sort(mobileList, new PriceCompare());
    }
}