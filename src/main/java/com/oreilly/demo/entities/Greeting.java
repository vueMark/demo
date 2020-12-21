package com.oreilly.demo.entities;

import org.springframework.stereotype.Component;

@Component
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

    public void setMessage(String message){
        this.message = message;
    }

    @Override
    public String toString(){
        return "Greeting{" +
                "message='" + message + '\'' +
                '}';
    }
}
