package com.itacademy.dicesgame.service.impl;

import com.itacademy.dicesgame.entity.Player;
import com.itacademy.dicesgame.repository.IPlayerRepository;
import com.itacademy.dicesgame.service.IPlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
public class PlayerServiceImpl {

    @Autowired
    private IPlayerRepository repository;

    public List<Player> getAllPlayers(){
        return repository.findAll();
    }


    /**
     * @Override
    @Transactional(readOnly = true)
    public List<Player> getAllPlayers() {
        System.out.println(playerRepository.findAll());
        return em.createQuery("from PlayerResponseDto").getResultList();
    }

    @Override
    @Transactional
    public void create(Player player) {
        if(player.getId() != null && player.getId() > 0){
            em.merge(player);
        } else{
            em.persist(player);
        }
    }**/



}
