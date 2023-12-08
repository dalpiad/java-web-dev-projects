package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> newMenu = new ArrayList<>();

    private Date dateAdded = new Date();

    public Menu(ArrayList<MenuItem> newMenu, Date dateAdded) {
        this.newMenu = newMenu;
        this.dateAdded = dateAdded;
    }

    public void addMenuItem(MenuItem menuItem) {
        getNewMenu().add(menuItem);
    }


    public ArrayList<MenuItem> getNewMenu() {
        return newMenu;
    }

    public void setNewMenu(ArrayList<MenuItem> newMenu) {
        this.newMenu = newMenu;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

//    public void printMenu() {
//        System.out.println("Enjoy out newest Menu!");
//        System.out.println("The menu was last updated: " + this.getDateAdded());
//        for (MenuItem item : this.newMenu) {
//            for ()
//        }
//
//
//    }
}
