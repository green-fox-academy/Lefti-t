package com.company;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MostCommonWordsInOrder {

    public static void textToCommonWords() {

//        Create a Stream expression which reads all text from this file, and prints the 100 most common words in descending order.
//        Keep in mind that the text contains punctuation characters which should be ignored. The result should be something like this:


        Path textfile = Paths.get("src/com/company/wikiArticle.txt");

        List<String> words = Collections.singletonList("");



        LinkedHashMap<String, Long> sortedMap = new LinkedHashMap<>();

        try {
            words = Arrays.asList(Files.readString(textfile).replaceAll("\\p{Punct}", "").toLowerCase().split("\\s+"));
        } catch (IOException e) {
            System.out.println("File not found!" + e);
        }

        Map<String, Long> frequentWords =
                words.stream().collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        frequentWords.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))

                .forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));
        System.out.println("Sorted Map   : " + sortedMap);

        //  frequentWords.forEach((k,v) -> System.out.println(k + ":" + v));

    }

    public static void main(String[] args) {
        textToCommonWords();
    }
}
