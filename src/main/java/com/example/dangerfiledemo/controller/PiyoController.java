package com.example.dangerfiledemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class PiyoController {

    @RequestMapping(value="/piyo")
    public String callPiyo() {
        return "Piyo !";
    }
}
