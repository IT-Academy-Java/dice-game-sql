package com.itacademy.dicesgame.repository;

import com.itacademy.dicesgame.entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface IGameRepository extends JpaRepository<Game, Long> {
}
