package com.fz.football_zone;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;

@Entity
@Data
@Table(name = "player")
@Getter
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String name;
    private String position;
    private String team;
    private String country;

    public Player() {

    }

    public Player(String id, String name, String team, String country, String position) {
        this.id = id;
        this.name = name;
        this.team = team;
        this.country = country;
        this.position = position;
    }

}
