package org.launchcode.java.studios.restaurantmenu;
import java.util.Date;

public class MenuItem {
    public static void main(String[] args) {
        Date myDate = new Date();
        System.out.println(myDate.getTime());
    }
    private String name;
    private double price;
    private String description;
    private String category;
    private Date   created;

    public String getName() {return name;}

    public void setName(String newName) { this.name = newName;}

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

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }


    public MenuItem(String name, double price, String description, String category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.created = new Date();
    }

    public boolean isRecentlyAdded() {
        long timeMillis = this.created.getTime();
        boolean isRecent;
        long now = new Date().getTime();
            if(now - 604800000 < timeMillis) {
                isRecent = true;
            }
            else {
                isRecent = false;
            }
            return isRecent;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals((MenuItem) obj);
    }
}
