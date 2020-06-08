package com.company.sum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sum {



    public int sum(ArrayList<Integer> list){

       int sum = 0;

        for (int i = 0; i < list.size() ; i++) {
            sum += list.get(i);
        }
        return sum;
    }



    }

