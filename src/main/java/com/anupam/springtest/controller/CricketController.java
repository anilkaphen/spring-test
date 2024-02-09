package com.anupam.springtest.controller;


import com.anupam.springtest.modal.Player;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class CricketController {
    private Map<String, List<Integer>> map = new HashMap<>();

    @GetMapping("/players")
    public ResponseEntity<Map<String, List<Integer>>> getPlayers() {
        map.put("panakj", Arrays.asList(10, 20, 30, 40, 0));
        try {
            return new ResponseEntity(map, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/player")
    public ResponseEntity<Player> addPlayer(@RequestBody Player player) {
        try {
            map.put(player.getName(), player.getRun());

            return new ResponseEntity(player, HttpStatus.CREATED);
        } catch (Exception e) {

            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/player/{name}")
    public ResponseEntity<Player> addPlayer(@PathVariable String name) {
        try {
            return new ResponseEntity(map.get(name), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/player")
    public ResponseEntity<Player> updatePlayer(@RequestBody Player player) {
        try {
            if (map.containsKey(player.getName())) {
                return new ResponseEntity(map.put(player.getName(), player.getRun()), HttpStatus.OK);
            }
            return new ResponseEntity("Player doesn't exist", HttpStatus.INTERNAL_SERVER_ERROR);
        } catch (Exception e) {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/player/{name}")
    public ResponseEntity<String> deletePlayer(@PathVariable String name) {
        try {
            if (map.containsKey(name)) {
                map.remove(name);
                return new ResponseEntity("User deleted successfully", HttpStatus.OK);
            }
            return new ResponseEntity("Player doesn't exist", HttpStatus.INTERNAL_SERVER_ERROR);
        } catch (Exception e) {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //    get-->return average of palyer examplle pankaj: 10
    @GetMapping("/avg/{name}")
    public ResponseEntity<Long> getPlayers(@PathVariable String name) {
        try {
            long sum = 0;
            List<Integer> list = map.get(name);
            for (int i : list) {
                sum = sum + i;
            }
            return new ResponseEntity(sum / list.size(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //get --> find player name who scroed highest number
    @GetMapping("/highest/score")
    public ResponseEntity<String> highestScorePlayerName() {
        int highest = -1, temp = -1;
        String highestScorePlayerName = "";

        try {
for (Map.Entry<String, List<Integer>> e : map.entrySet())
{
                List<Integer> list = e.getValue();
                temp = Collections.max(list);
                if (temp > highest) {
                    highest = temp;
                    highestScorePlayerName = e.getKey();
                }
            }

            return new ResponseEntity(highestScorePlayerName, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //    get --> find player name whose avg is lower
    @GetMapping("/lowest/avg")
    public ResponseEntity<String> lowestAvgPlayerName() {
        int lowest = -1, avg = -1, sum = 0;
        String lowestPlayerName = "";
        try {
            for (Map.Entry<String, List<Integer>> e : map.entrySet()) {
                List<Integer> list = e.getValue();
                for (int i : list) {
                    sum = sum + i;
                }
                avg = sum / list.size();
                if (avg < lowest) {
                    lowest = avg;
                    lowestPlayerName = e.getKey();
                }
            }
            return new ResponseEntity(lowestPlayerName, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
