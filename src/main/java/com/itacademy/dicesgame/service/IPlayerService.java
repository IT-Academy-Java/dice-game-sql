package com.itacademy.dicesgame.service;

import com.itacademy.dicesgame.entity.Player;

import java.util.List;
import java.util.Optional;

public interface IPlayerService {

    public List<Player> getAllPlayers();
    public Optional<Player> getPlayer(Long player_id);


    /**public void create(Player player);
    public Player savePlayer(Player player);**/

}
