package com.fz.football_zone;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/player")
public class PlayerController {

    private final PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping("/all")
    public List<Player> getAllPlayers() {
        return playerService.getPlayers();
    }

    @GetMapping("/team")
    public List<Player> getPlayersFromTeam(@RequestParam String team) {
        return playerService.getPlayersFromTeam(team);
    }

    @PostMapping("/add")
    public Player addPlayer(@RequestBody Player player) {
        return playerService.savePlayer(player);
    }

}
