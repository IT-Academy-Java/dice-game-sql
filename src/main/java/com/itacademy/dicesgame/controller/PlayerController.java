package com.itacademy.dicesgame.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", methods= { RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE })
@RequestMapping("/players")
public class PlayerController {


    @GetMapping("/")
    public String hello() {
        return "Hello Darling!";
    }
}
