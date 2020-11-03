package com.itacademy.dicesgame.service;

import com.itacademy.dicesgame.dto.PlayerResponseDto;

import java.util.List;

public interface IPlayerService {

    public List<PlayerResponseDto> getPlayers();

    public List<PlayerResponseDto> findAll();

}
