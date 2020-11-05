package com.itacademy.dicesgame.service;

import com.itacademy.dicesgame.entity.Player;

import java.util.List;
import java.util.Optional;

public interface IPlayerService {

    public List<Player> getAllPlayers();
    public Optional<Player> findPlayer(Long player_id);
    public Player savePlayer(Player player);

}
