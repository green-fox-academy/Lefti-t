package com.company.sharpie;

import java.util.ArrayList;
import java.util.List;
public class SharpieSet {

List<Sharpie> sharpieList = new ArrayList<Sharpie>();


 public int usable(){
     int i=0;
     for (Sharpie sharpie: sharpieList) {
         if ( sharpie.inkAmount > 0) i++;
     }
         return i;
     }
 }







