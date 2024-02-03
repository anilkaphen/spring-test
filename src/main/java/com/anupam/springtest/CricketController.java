package com.anupam.springtest;


import com.anupam.springtest.modal.Player;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class CricketController {
    private Map<String, List<Integer>> map = new HashMap<>();

    @GetMapping("/players")
    ResponseEntity<Map<String, List<Integer>>> getPlayers() {
//        map.put("panakj", Arrays.asList(10, 20, 30, 40, 0));
        try {
            return new ResponseEntity(map, HttpStatus.OK);
        } catch(Exception e) {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/player")
    ResponseEntity<Player> addPlayer(@RequestBody Player player) {
        try {
            map.put(player.getName(), player.getRun());

            return new ResponseEntity(player, HttpStatus.CREATED);
        } catch(Exception e) {

            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/player/{name}")
    ResponseEntity<Player> addPlayer(@PathVariable String name) {
        try {
            return new ResponseEntity(map.get(name), HttpStatus.OK);
        } catch(Exception e) {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/player")
    ResponseEntity<Player> updatePlayer(@RequestBody Player player) {
        try {
            if(map.containsKey(player.getName())) {
                return new ResponseEntity(map.put(player.getName(), player.getRun()), HttpStatus.OK);
            }
            return new ResponseEntity("Player doesn't exist", HttpStatus.INTERNAL_SERVER_ERROR);
        } catch(Exception e) {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/player/{name}")
    ResponseEntity<String> deletePlayer(@PathVariable String name) {
        try {
            if(map.containsKey(name)) {
                map.remove(name);
                return new ResponseEntity("User deleted successfully", HttpStatus.OK);
            }
            return new ResponseEntity("Player doesn't exist", HttpStatus.INTERNAL_SERVER_ERROR);
        } catch(Exception e) {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
