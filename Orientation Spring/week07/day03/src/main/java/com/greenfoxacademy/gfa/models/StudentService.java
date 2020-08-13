package com.greenfoxacademy.gfa.models;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService {

    private List<String> names;

    public StudentService() {
        names = new ArrayList<>();
        names.add("Sanyi");
        names.add("Lilla");
        names.add("Alex");
        names.add("John");
        names.add("Jerry");
        names.add("Henry");
        names.add("Alicia");
        names.add("Patricia");
    }

    public List<String> findAll() {
        return names;
    }

    public void save(String student) {
        names.add(student);
    }

    public String count() {
        return String.valueOf(names.size());
    }

    public List<String> checkResults(String text) {
        return this.names.stream()
                .filter(s -> s.toLowerCase().contains(text.toLowerCase()))
                .collect(Collectors.toList());
    }
}