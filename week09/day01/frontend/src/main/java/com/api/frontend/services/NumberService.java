package com.api.frontend.services;

import com.api.frontend.models.Number;
import org.springframework.stereotype.Component;

@Component
public class NumberService {

    public Number doubleNumber(long number){
        return new Number(number * 2);
    }
}
