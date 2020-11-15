package com.itacademy.dicesgame.service;

import com.itacademy.dicesgame.entity.Game;

public interface IGameService {

    public Game rollDices(Long player_id);
    public void deleteByPlayerId(Long player_id);

}
