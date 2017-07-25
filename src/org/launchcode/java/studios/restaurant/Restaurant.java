package org.launchcode.java.studios.restaurant;

/**
 * Created by chris on 7/25/17.
 */
public class Restaurant {

    // main method
    public static void main(String[] args) {

        // create menu items
        MenuItem item1 = new MenuItem(9.00, "burger",
                MenuItem.MAIN_COURSE, false);

        MenuItem item2 = new MenuItem(5.00, "cake",
                MenuItem.DESSERT, true);

        MenuItem item3 = new MenuItem(7.00, "wings",
                MenuItem.APPETIZER, false);

        // create a menu and add items
        Menu menu = new Menu();
        menu.addMenuItem("burger", item1);
        menu.addMenuItem("cake", item2);
        menu.addMenuItem("wings", item3);
        System.out.println(menu);

        // remove items
        menu.removeMenuItem("burger");
        menu.removeMenuItem("cake");
        menu.removeMenuItem("wings");
        System.out.println(menu);

        // add one more item
        menu.addMenuItem("burger", item1);
        System.out.println(menu);
    }

}
