package org.launchcode.java.studios.restaurantmenu;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.atomic.AtomicBoolean;

public class Menu {
    public static void main(String[] args) {

    }
    private ArrayList<MenuItem> menuItems;
    private Date lastUpdated;

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public Menu (ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public void addMenuItem(MenuItem newMenuItem) {
        if(this.menuItems.contains(newMenuItem)) {
            System.out.println("\n");
            System.out.println("This Item is already on the menu. \n");
        } else {
            this.menuItems.add(newMenuItem);
        }

    }

    public void removeMenuItem(MenuItem itemToRemove) {
                menuItems.remove(itemToRemove);
    }

    public void getItem(String name) {
        menuItems.forEach((n) -> {
            if(n.getName().toLowerCase().equals(name.toLowerCase())){
                System.out.println(n.getName());
                System.out.println(n.getDescription());
                if(n.isRecentlyAdded()) {
                    System.out.println("Recently Added");
                };
                System.out.println(n.getCategory());
                System.out.println("$" + n.getPrice());
                System.out.println("_______________________");
            }
        });
    }

    public void getAllItems() {
        menuItems.forEach((n) -> {
            System.out.println(n.getName());
            System.out.println(n.getDescription());
            if(n.isRecentlyAdded()) {
                System.out.println("Recently Added");
            };
            System.out.println(n.getCategory());
            System.out.println("$" + n.getPrice());
            System.out.println("_______________________");
        });
    }



}
