package org.launchcode.java.studios.restaurant;

import java.util.Date;
import java.util.HashMap;

/**
 * Created by chris on 7/11/17.
 */
public class Menu {

    // fields
    private HashMap<String, MenuItem> menuItems;
    private Date lastUpdate;

    // constructor
    public Menu(HashMap<String, MenuItem> menuItems) {
        this.menuItems = menuItems;
        this.lastUpdate = new Date();
    }

    // getters and setters
    public HashMap<String, MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(HashMap<String, MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    // add and remove menu items
    public void addMenuItem(String itemName, MenuItem menuItem) {
        this.menuItems.put(itemName, menuItem);
    }

    public void removeMenuItem(String itemName) {
        this.menuItems.remove(itemName);
    }

    // main method
    public static void main(String[] args) {

        MenuItem item1 = new MenuItem(9.00, "burger",
                MenuItem.MAIN_COURSE, false);

        MenuItem item2 = new MenuItem(5.00, "cake",
                MenuItem.DESSERT, true);

        MenuItem item3 = new MenuItem(7.00, "wings",
                MenuItem.APPETIZER, false);

        HashMap<String, MenuItem> menuItems = new HashMap<>();
        menuItems.put("burger", item1);
        menuItems.put("cake", item2);
        menuItems.put("wings", item3);

        Menu menu = new Menu(menuItems);
        System.out.println(menu.getMenuItems());

        menu.removeMenuItem("burger");
        menu.removeMenuItem("cake");
        menu.removeMenuItem("wings");
        System.out.println(menu.getMenuItems());

        menu.addMenuItem("burger", item1);
        System.out.println(menu.getMenuItems());
    }

}
