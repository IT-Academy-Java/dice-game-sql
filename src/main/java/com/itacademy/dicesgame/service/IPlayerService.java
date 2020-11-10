package com.itacademy.dicesgame.service;

import com.itacademy.dicesgame.entity.Player;

import java.util.List;

public interface IPlayerService {

    public List<Player> getAllPlayers();
    public Player findPlayer(Long player_id);
    public Player savePlayer(Player player);
    public Player updatePlayer(Long player_id, Player player);

}
