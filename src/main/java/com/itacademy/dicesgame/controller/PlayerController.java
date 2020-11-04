package com.itacademy.dicesgame.controller;

import com.itacademy.dicesgame.dto.PlayerResponseDto;
import com.itacademy.dicesgame.service.impl.PlayerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/players")
@CrossOrigin(origins = "*", methods= { RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE })
public class PlayerController {

    @Autowired
    private PlayerServiceImpl playerServiceImpl;

    @GetMapping("/greeting")
    public String hello() {
        return "Hello Darling!";
    }

    @GetMapping("/")
    @ResponseBody
    public List<PlayerResponseDto> getPlayers() throws Exception{
        return playerServiceImpl.findAll();
    }


}
