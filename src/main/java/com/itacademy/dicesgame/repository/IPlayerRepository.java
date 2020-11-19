package com.itacademy.dicesgame.repository;

import com.itacademy.dicesgame.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface IPlayerRepository extends JpaRepository<Player, Integer> {

    List<Player> findAll();

    Player findById(Long idPlayer);

    Boolean existsByName(String name);

}
