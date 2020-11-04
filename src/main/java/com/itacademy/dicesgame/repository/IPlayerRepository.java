package com.itacademy.dicesgame.repository;

import com.itacademy.dicesgame.dto.PlayerResponseDto;

import java.util.List;

public interface IPlayerRepository {

    List<PlayerResponseDto> getPlayers();
}
