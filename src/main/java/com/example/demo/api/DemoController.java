package com.example.demo.api;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class DemoController {

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public String helloWorld() {
        return "Hello world 3";
    }
}
