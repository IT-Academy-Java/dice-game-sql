package com.itacademy.dicesgame.service.impl;

import com.itacademy.dicesgame.entity.Game;
import com.itacademy.dicesgame.repository.IGameRepository;
import com.itacademy.dicesgame.service.IGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameServiceImpl implements IGameService {

    @Autowired
    private IGameRepository repository;

    @Override
    public Game rollDices(long player_id) {
        Game game = new Game(player_id);
        game.rollDices();

        return repository.save(game);
    }
}
