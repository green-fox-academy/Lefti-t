package com.greenfoxacademy.webshop.models;

import java.util.ArrayList;
import java.util.List;

public class ItemsList {

    List<ShopItems> itemsList;



    public ItemsList(){
        itemsList = new ArrayList<>();
        itemsList.add(new ShopItems("Road bike","Carbon road bike with 24 gears",20000,2));
        itemsList.add(new ShopItems("City bike","Alu city bike with 8 gears",12000,5));
        itemsList.add(new ShopItems("Mountain bike","Alu full suspension mtb with 12 gears",24000,1));
        itemsList.add(new ShopItems("Downhill bike","Carbon downhill bike with 9 gears",34000,2));
        itemsList.add(new ShopItems("Kids bike","Alu kids bike for ages 5-8",3500,6));
    }

    public List<ShopItems> getItemsList() {
        return itemsList;
    }

    public void setItemsList(List<ShopItems> itemsList) {
        this.itemsList = itemsList;
    }
}
