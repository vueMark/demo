package com.oreilly.demo.entities;

public class Greeting {
    private String message;

    public Greeting(){
        this("Hello, World!");
    }

    public Greeting(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
