package com.greenfoxacademy.springstart;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class Greeting {


    protected long id;
    protected String content;
   protected static AtomicLong greetCount = new AtomicLong(1);

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
        greetCount.getAndIncrement();

    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public Integer getGreetCount() {
        return greetCount.intValue();
    }



    @Override
    public String toString() {
        return "Greeting{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", greetCount=" + greetCount +
                '}';
    }
}
