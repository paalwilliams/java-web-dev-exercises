package org.launchcode.java.studios.restaurantmenu;

import java.util.ArrayList;

public class Restaurant {
    public static void main(String[] args) {
        ArrayList<MenuItem> myMenuItems = new ArrayList<MenuItem>();

        MenuItem pizza = new MenuItem("Pizza", 5.55, "A big pizza", "Main Course");
        MenuItem spaghetti = new MenuItem("Spaghetti", 9.99, "A big spaghetti", "Main Course");
        MenuItem chocolateCake = new MenuItem("Chocolate Cake", 1.99, "A big chocolate cake", "Dessert");
        MenuItem hummus = new MenuItem("Hummus", 2.99, "Some big Hummus", "Appetizer");
        myMenuItems.add(chocolateCake);
        myMenuItems.add(hummus);
        myMenuItems.add(pizza);
        myMenuItems.add(spaghetti);
        Menu myMenu = new Menu(myMenuItems);
        myMenu.getAllItems();
        myMenu.getItem("Spaghetti");
        myMenu.removeMenuItem(pizza);
        myMenu.getAllItems();


    }
}
