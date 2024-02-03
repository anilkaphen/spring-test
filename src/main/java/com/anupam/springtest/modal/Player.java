package com.anupam.springtest.modal;

import java.util.List;
public class Player {
    private String name;
    private List<Integer> run;

    public Player() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getRun() {
        return run;
    }

    public void setRun(List<Integer> run) {
        this.run = run;
    }
}
