package com.company;

public class Main {

    public static void main(String[] args) {
        Elevator elevator = new Elevator();
        elevator.PassengerIn(2);
        System.out.println("Currently " + elevator.CurrentPeople + " peoples remaining in elevator");
        elevator.PassengerIn(2);
        System.out.println("Currently " + elevator.CurrentPeople + " peoples remaining in elevator");
        elevator.MoveDown();
        System.out.println("Elevator is currently waiting on " + elevator.CurrentFloor + "nd floor");
        elevator.PassengerIn(2);
        System.out.println("Currently " + elevator.CurrentPeople + " peoples remaining in elevator");
        elevator.PassengerIn(2);
        elevator.PassengerIn(2);
        elevator.PassengerIn(2);


    }
}
