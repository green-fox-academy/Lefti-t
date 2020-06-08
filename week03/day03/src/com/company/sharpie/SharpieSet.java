package com.company.sharpie;

import java.util.ArrayList;
import java.util.List;
public class SharpieSet {

List<Sharpie> sharpieList = new ArrayList<Sharpie>();

    public void addItem(Sharpie sharpie) {
        this.sharpieList.add(sharpie);
    }

 public int usable(){
     int i=0;
     for (Sharpie sharpie: sharpieList) {
         if ( sharpie.getInkAmount() > 0) i++;
     }
         return i;
     }
 }







