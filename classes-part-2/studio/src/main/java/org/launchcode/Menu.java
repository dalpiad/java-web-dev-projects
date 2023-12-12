package org.launchcode;

import java.util.ArrayList;
import java.util.Comparator;
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
    public void removeItemByName (String itemName){
        this.newMenu.removeIf(e -> e.getName().equalsIgnoreCase(itemName));
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

    public ArrayList<MenuItem> sortMenu(ArrayList<MenuItem> unsortedMenu){
        setNewItems(unsortedMenu);
        unsortedMenu.sort(Comparator.comparing(MenuItem::getItemCategory));
        return unsortedMenu;
    }

    public void setNewItems(ArrayList<MenuItem> unsortedMenu){
        unsortedMenu.sort(Comparator.comparing(MenuItem::getDateAdded));
//        for(int i=0 ; i < 2; i++ ){
//            unsortedMenu.get(i).setNew(true);
//        }
        for (int i=2 ; i< unsortedMenu.size(); i++ ){
            unsortedMenu.get(i).setNew(false);
        }
    }


    public void printMenu(){
        int i=0;
        this.newMenu = sortMenu(this.newMenu);
        System.out.println("================================= " + this.newMenu.get(i).getItemCategory().toUpperCase() + "S =====================================");
        for( i = 0 ; i< this.newMenu.size(); i++ ){
            System.out.println(this.newMenu.get(i).printItem());
            if(i+1 == this.newMenu.size()){
                System.out.println("=============================Gratuity automatically added, no exceptions for allergies============================");
            } else if(this.newMenu.get(i).getItemCategory().compareTo(this.newMenu.get(i+1).getItemCategory()) != 0){
                System.out.println("================================= " + this.newMenu.get(i+1).getItemCategory().toUpperCase() + "S =====================================");
            }
        }
        System.out.println("================================= Date Modified: " + this.getDateAdded() + " =====================================");
    }

}


