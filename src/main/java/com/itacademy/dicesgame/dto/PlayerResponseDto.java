package com.itacademy.dicesgame.dto;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Component
@Data
@Entity
@Table(name="player")
public class PlayerResponseDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date registration_date;

    @OneToMany(mappedBy = "player_id", cascade = {
            CascadeType.ALL
    })
    private List<GameResponseDto> games;

}