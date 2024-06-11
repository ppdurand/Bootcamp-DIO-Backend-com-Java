package edu.APIEstudos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {
    @GetMapping()
    public String helloWorld(){
        return "Hello, World";
    }
}
