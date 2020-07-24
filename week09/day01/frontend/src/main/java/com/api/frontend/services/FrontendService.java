package com.api.frontend.services;

import com.api.frontend.models.Append;
import com.api.frontend.models.Greeter;
import com.api.frontend.models.ArrayHandling;
import com.api.frontend.models.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Service
public class FrontendService {

    @Autowired
    public FrontendService() {
    }

    public String appended(){
        return "Hello!";
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

    public Object arrayHandlerService(ArrayHandling what) {
        int[] result = new int[what.getNumbers().size()];
        if (what.getNumbers() == null) {
            return new ResponseEntity<>(new Error("Please provide what to do with the numbers!"), HttpStatus.BAD_REQUEST);
        } else {
            switch (what.getWhat()) {
                case "sum":
                    int sum = what.getNumbers().stream().mapToInt(Integer::intValue).sum();
                    return new Result(sum);
                case "multiply":
                    int multiplication = what.getNumbers().stream().reduce(1, (a, b) -> a * b);
                    return new Result(multiplication);
                case "double":
                    int[] arrayOutput = new int[what.getNumbers().size()];
                    for (int s = 0; s < result.length; s++) {
                       int resultArray = what.getNumbers().get(s) * 2;
                   arrayOutput[s] = resultArray;
                    }
                    return arrayOutput;
            }
        }
        return null;
    }
}