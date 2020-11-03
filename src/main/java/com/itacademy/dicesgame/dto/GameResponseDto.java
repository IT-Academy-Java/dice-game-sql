package com.itacademy.dicesgame.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Data
@Entity
@Table(name="game")
public class GameResponseDto extends ResponseDto{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int dice_value1;
    private int dice_value2;

    private boolean win;

    private Long player_id;

}
