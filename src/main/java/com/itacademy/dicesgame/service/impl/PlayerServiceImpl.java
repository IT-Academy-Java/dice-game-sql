package com.itacademy.dicesgame.service.impl;

import com.itacademy.dicesgame.entity.Player;
import com.itacademy.dicesgame.repository.IPlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerServiceImpl {

    @Autowired
    private IPlayerRepository repository;

    public List<Player> getAllPlayers(){
        return repository.findAll();
    }

    public Player findPlayer(Long player_id){
        return repository.findById(player_id);
    }

    public Player savePlayer(Player player){
        return repository.save(player);
    }

    public Player updatePlayer(Long player_id, Player player){
        Player oldPlayer = repository.findById(player_id);

        player.setId(player_id);
        player.setRegistration_date(oldPlayer.getRegistration_date());

        System.out.println(player.getName());
        System.out.println(player.getRegistration_date());
        System.out.println(player.toString());

        return  repository.save(player);
    }

}
