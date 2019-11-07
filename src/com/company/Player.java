package com.company;

import java.util.Random;

public abstract class Player {
    public String name = "Anonim";
    public Player (){

    }
    public Player(String name){
        setName(name);

    }

    private Random brain = new Random();

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.err.println("Złe imię");
        }

    }

    public String getName() {

        return name;
    }

    public abstract int guess();

}