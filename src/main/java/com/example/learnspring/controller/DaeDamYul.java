package com.example.learnspring.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DaeDamYul {
    @GetMapping("/")
    public String test(){return "<h1>대 담 율</h1>선배님 사랑해요~";}

}

