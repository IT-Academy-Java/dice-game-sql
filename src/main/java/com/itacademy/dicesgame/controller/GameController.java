package com.itacademy.dicesgame.controller;

import com.itacademy.dicesgame.entity.Game;
import com.itacademy.dicesgame.service.impl.GameServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.util.BsonUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods= { RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE })
@RequestMapping("/players")
public class GameController {

    @Autowired
    private GameServiceImpl service;

    @GetMapping("/{id}/games")
    @ResponseBody
    public List<Game> getGamesByPlayer(@PathVariable(value = "id") Long id) throws Exception{
        if(id != null){
            try {
                return service.getGamesByPlayer(id);
            } catch (Exception e){
                System.out.println(ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getCause()));
            }
        }
        return null;
    }

    @PostMapping("/{id}/games")
    public ResponseEntity<Game> addRollDices(@PathVariable(value="id") Long id) throws Exception{
        return ResponseEntity.ok().body(service.rollDices(id));
    }

    @DeleteMapping("/{id}/games")
    public ResponseEntity deleteRollsByPlayer(@PathVariable(value = "id") Long id) throws Exception{
         try {
             service.deleteByPlayerId(id);
             return ResponseEntity.ok().build();
         } catch (Exception exception){
             return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(exception.getCause());
         }
    }

}
