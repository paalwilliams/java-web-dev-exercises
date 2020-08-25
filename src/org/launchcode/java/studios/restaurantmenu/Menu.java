package org.launchcode.java.studios.restaurantmenu;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    public static void main(String[] args) {
        ArrayList<MenuItem> myMenuItems = new ArrayList<MenuItem>();
        MenuItem pizza = new MenuItem(5.50, "A big pizza", "Fast Food");
        MenuItem spaghetti = new MenuItem(9.99, "A big spaghetti", "Italian");
        myMenuItems.add(pizza);
        myMenuItems.add(spaghetti);
        Menu myMenu = new Menu(myMenuItems);

        ArrayList<MenuItem> menuItems = myMenu.getMenuItems();
        menuItems.forEach((n) -> {
            System.out.println(n.getDescription());
            if(n.isRecentlyAdded()) {
                System.out.println("Recently Added");
            };
            System.out.println(n.getCategory());
            System.out.println("$" + n.getPrice());
        });
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


}
