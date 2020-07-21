package com.api.frontend.services;

import com.api.frontend.models.Greeter;
import com.api.frontend.models.NumbersArray;
import com.api.frontend.models.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class FrontendService {

    @Autowired
    public FrontendService() {
    }

    public Object getGreeting(String name, String title, HttpServletResponse response) {
        Greeter greeter = new Greeter();
        Map<String, Object> greet = new HashMap<>();

        if (name != null && title != null) {
            response.setStatus(HttpServletResponse.SC_OK);
            greet.put("welcome_message", String.format("Oh, hi there %s, my dear %s!", name, title));
        }
        if (name == null && title == null) {
            response.setStatus(400);
            greet.put("error", "Please provide a name and a title!");

        } else if (name == null) {
            response.setStatus(400);
            greet.put("error", "Please provide a name!");

        } else if (title == null) {
            response.setStatus(400);
            greet.put("error", "Please provide a title!");
        }

        return greet;
    }


    public Result getAction(String action, Integer until) {
        Integer result = 0;

        switch (action) {
            case "sum":
                result = getSum(until, result);
                break;
            case "factor":
                result = getFactor(until, result);
                break;
        }
        return new Result(result);
    }

    private Integer getSum(final Integer until, Integer result) {
        for (int i = 0; i <= until; i++) {
            result += i;
        }
        return result;
    }

    private Integer getFactor(final Integer until, Integer result) {
        int fact = 1;
        for (int i = 1; i <= until; i++) {
            fact = fact * i;
            result = fact;
        }
        return result;
    }

    public Object arrayHandlerService(NumbersArray action) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        switch (action) {
            case "sum":
                 Collections.singletonMap("result", numbers.stream().mapToInt(Integer::intValue)
                        .sum());
            case "multiply":
                Collections.singletonMap("result", numbers.stream().reduce(1, (a, b) -> a * b));
                break;
            case "double":
                Collections.singletonMap("result", numbers.stream().map(i->2*i).toArray(Integer[]::new));
                break;

        }
        return new NumbersArray(numbers);
    }

}