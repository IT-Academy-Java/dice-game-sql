package com.itacademy.dicesgame.controller;

import com.itacademy.dicesgame.dto.PlayerResponseDto;
import com.itacademy.dicesgame.service.impl.PlayerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods= { RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE })
@RequestMapping("/players")
public class PlayerController {

    @Autowired
    private PlayerServiceImpl playerService;

    @GetMapping("/greeting")
    public String hello() {
        return "Hello Darling!";
    }

    @GetMapping("/")
    @ResponseBody
    public List<PlayerResponseDto> getPlayers() throws Exception{
        return playerService.findAll();
    }


}
