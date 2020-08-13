package com.company.anagram;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;


public class AnagramTest {

    Anagram an = new Anagram();

@Test
    public void AnagramTesting(){
    boolean anagram = true;
    assertEquals(anagram,an.check(an.string,an.string2));

    }

}
