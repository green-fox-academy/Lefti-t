package com.greenfoxacademy.webshop.models;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ItemsList {

    List<ShopItems> itemsList;


    public ItemsList() {
        itemsList = new ArrayList<>();
        itemsList.add(new ShopItems("Road bike", "Carbon road bike with 24 gears", 20000, 2));
        itemsList.add(new ShopItems("City bike", "Alu city bike with 8 gears", 12000, 5));
        itemsList.add(new ShopItems("Mountain bike", "Alu full suspension mtb with 12 gears", 24000, 0));
        itemsList.add(new ShopItems("Downhill bike", "Carbon downhill mtb bike with 9 gears", 34000, 2));
        itemsList.add(new ShopItems("Kids bike", "Alu kids bike for ages 5-8", 3500, 6));
    }

    public List<ShopItems> getItemsList() {
        return itemsList;
    }

    public void setItemsList(List<ShopItems> itemsList) {
        this.itemsList = itemsList;
    }


    public List<ShopItems> getInStockList() {
        List<ShopItems> inStock = itemsList.stream()
                .filter(n -> n.getQuantityOfStock() > 0)
                .collect(Collectors.toList());

        return inStock;
    }

    public List<ShopItems> getCheapestFirst() {
        List<ShopItems> cheapestFirst = itemsList.stream()
                .sorted(Comparator.comparingDouble(ShopItems::getPrice))
                .collect(Collectors.toList());
        return cheapestFirst;
    }

    public Double getAvgStock() {
        return itemsList.stream()
                .collect(Collectors.averagingInt(ShopItems::getQuantityOfStock));

    }

    public List<ShopItems> getContainsBike() {
        List<ShopItems> containsBike = itemsList.stream()
                .filter(s -> s.getDescription().contains("mtb"))
                .collect(Collectors.toList());
        return containsBike;
    }

    public ShopItems getMostExpensive() {
        List<ShopItems> mostExpensive = itemsList.stream()
        .sorted((ShopItems s1, ShopItems s2) -> (int) (s2.getPrice() - s1.getPrice()))
                .collect(Collectors.toList());

        return mostExpensive.get(0);
    }
}
