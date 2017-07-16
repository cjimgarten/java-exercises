package org.launchcode.java.studios.restaurant;

/**
 * Created by chris on 7/11/17.
 */
public class MenuItem {

    // constants
    public static final String APPETIZER = "appetizer";
    public static final String MAIN_COURSE = "main course";
    public static final String DESSERT = "dessert";

    // fields
    private double price;
    private String description;
    private String category;
    private boolean newItem;

    // constructor
    public MenuItem(double price,
                    String description, String category,
                    boolean newItem) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.newItem = newItem;
    }

    // getters and setters
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isNewItem() {
        return newItem;
    }

    public void setNewItem(boolean newItem) {
        this.newItem = newItem;
    }

    // to string
    @Override
    public String toString() {
        return "MenuItem{" +
                "price=" + price +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", newItem=" + newItem +
                '}';
    }

}
