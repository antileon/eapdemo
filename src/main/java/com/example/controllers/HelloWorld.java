package com.example.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by udourbantschitsch on 05/12/2016.
 * Displays a simple Hello World.
 */

@RestController
public class HelloWorld {

    @RequestMapping("/")
    public String displayHelloWorld() {
        return "Hello World";
    }
}
