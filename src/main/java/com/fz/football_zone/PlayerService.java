package com.fz.football_zone;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PlayerService {

    private final PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public List<Player> getPlayers() {
        return playerRepository.findAll();
    }

    public List<Player> getPlayersFromTeam(String teamName) {
        return playerRepository.findByTeam(teamName);
    }

    public Player savePlayer(Player player) {
        return playerRepository.save(player);
    }
}
