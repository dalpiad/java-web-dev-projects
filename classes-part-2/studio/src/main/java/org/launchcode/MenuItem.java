package org.launchcode;

import java.time.LocalDate;

public class MenuItem {private String name = "";

    private double price;

    private String description = "";

    private String itemCategory = "";
    private boolean isNew = true;

    private LocalDate dateAdded;

    public MenuItem(String name, double price, String description, String itemCategory, boolean isNew, LocalDate dateAdded) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.itemCategory = itemCategory;
        this.isNew = isNew;
        this.dateAdded = dateAdded;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public String getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }

    public String printItem(){ //print method that includes New item print case
        String pricePrint = Double.toString(this.price);
        if(this.isNew){
            return ("NEW! " + this.name + ": " + this.description + "   $" + pricePrint);
        } else return (this.name + ": " + this.description + "   $" + pricePrint);

    }

    public void setDateAdded(LocalDate dateAdded) {
        this.dateAdded = dateAdded;
    }
}

