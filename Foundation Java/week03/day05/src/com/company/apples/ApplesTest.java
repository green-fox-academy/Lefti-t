package com.company.apples;


import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ApplesTest {

    Apples redApple = new Apples();


    @Test
    public void test(){
        redApple.getApple();
        assertEquals("red apple",redApple.getApple());

    }
}
