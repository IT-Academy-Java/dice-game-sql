package com.itacademy.dicesgame.service.impl;

import com.itacademy.dicesgame.dto.PlayerResponseDto;
import com.itacademy.dicesgame.repository.PlayerRepository;
import com.itacademy.dicesgame.service.IPlayerService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
public class PlayerServiceImpl implements IPlayerService {

    private final PlayerRepository playerRepository;

    public PlayerServiceImpl(PlayerRepository playerRepository){
        this.playerRepository = playerRepository;
    }

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<PlayerResponseDto> getPlayers() {
        return null;
    }

    @Override
    @Transactional(readOnly = true)
    public List<PlayerResponseDto> findAll() {
        //return playerRepository.findAll();
        return em.createQuery("from PlayerResponseDto").getResultList();
    }
}
