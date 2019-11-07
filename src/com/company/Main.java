package com.company;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        PlayerComp player = new PlayerComp("Janusz");
        //player.setName("");
        int number, guess;
        Random dice = new Random();
        System.out.print("Kostka");
        System.out.println();
        do {
            number = dice.nextInt(6) + 1;
            System.out.println("Liczba oczek kostki: " + number);
            guess = player.guess();
            System.out.println(player.getName() + " liczba oczek : " + guess);
            if (number == guess) {
                System.out.println("Gratulacje udalo sie trafic liczbe ");

            }
            else {
                System.out.println("PUDLO!");
            }
        } while (number != guess);

    }
}