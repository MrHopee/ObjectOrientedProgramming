package com.company;

public class Player {
    private String name;

    private String choice;

    public Player() {
    }

    public Player(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

    public String getChoice() {
        return choice;
    }


}
