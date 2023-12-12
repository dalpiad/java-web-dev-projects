package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Restaurant {

    public static void main(String[] args) {
        MenuItem waffles = new MenuItem(
                "Tasty Waffles",
                5.99,
                "The tastiest waffles you've ever had.",
                "breakfast",
                true,
                LocalDate.now()
        );

        MenuItem hamSandwich = new MenuItem(
                "HamSammy",
                7.99,
                "So good you will won't want to share.",
                "main course",
                true,
                LocalDate.now()
        );

        MenuItem cheeseCurds = new MenuItem(
                "Cheesy Bits",
                12.49,
                "Bits O Cheese",
                "appetizer",
                true,
                LocalDate.now()
        );

//        MenuItem friedIceCream = new MenuItem(
//        );

        ArrayList<MenuItem> weekendMenuItems = new ArrayList<>();


        Menu weekendMenu = new Menu(
                weekendMenuItems,
                new Date()
        );
        weekendMenu.addMenuItem(waffles);
        weekendMenu.addMenuItem(cheeseCurds);
        weekendMenu.addMenuItem(hamSandwich);
        weekendMenu.addMenuItem(new MenuItem("Icy Hot",
                        15.95,
                        "It's both hot and cold, but oh so good.",
                        "dessert",
                        true,
                        LocalDate.now()));

        weekendMenu.printMenu();

        weekendMenu.removeItemByName("HamSammy");

        weekendMenu.printMenu();

    }
}
