package com.itacademy.dicesgame.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name="game")
public class Game implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int dice_value1;
    private int dice_value2;

    private boolean win;

    private Long player_id;

}
