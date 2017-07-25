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
    public Menu() {
        this(new HashMap<>());
    }

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

    // to string
    @Override
    public String toString() {
        return "Menu{" +
                "menuItems=" + menuItems +
                ", lastUpdate=" + lastUpdate +
                '}';
    }

}
