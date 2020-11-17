package com.itacademy.dicesgame.service.impl;

import com.itacademy.dicesgame.entity.Player;
import com.itacademy.dicesgame.repository.IPlayerRepository;
import com.itacademy.dicesgame.service.IPlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PlayerServiceImpl implements IPlayerService {

    @Autowired
    private IPlayerRepository repository;

    @Override
    public List<Player> getAllPlayers(){
        return repository.findAll();
    }

    @Override
    public Map<String, Double> getAllPlayersWithAvgSuccessRate() {
        List<Player> listAllPlayers = repository.findAll();
        Map<String, Double> mapPlayersWithAvgSuccessRate = new HashMap<String, Double>();

        if(listAllPlayers != null){
            for(Player player: listAllPlayers){
                mapPlayersWithAvgSuccessRate.put(player.getName(), (double) 1);
            }
        }
        return mapPlayersWithAvgSuccessRate;
    }

    @Override
    public Player findPlayer(Long player_id){
        return repository.findById(player_id);
    }

    @Override
    public Player savePlayer(Player player){
        return repository.save(player);
    }

    @Override
    public Player updatePlayer(Long player_id, Player player){
        Player oldPlayer = repository.findById(player_id);

        player.setId(player_id);
        player.setRegistration_date(oldPlayer.getRegistration_date());

        return  repository.save(player);
    }

}
