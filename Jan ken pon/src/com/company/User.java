package com.company;

import java.util.Locale;
import java.util.Scanner;

public class User extends Player {
    private Scanner input;

    public User() {
        input = new Scanner(System.in);
    }

    public void selectChoice(){
        System.out.println("Enter your choice: R - Rock, P - Paper, S - Scissors");
        setChoice(input.nextLine().toUpperCase());
    }
}
