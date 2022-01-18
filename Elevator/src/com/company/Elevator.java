package com.company;

public class Elevator {
    public int Capacity = 4;
    public int CurrentPeople = 0;
    public int CurrentFloor = 0;

    public void MoveUp() {
        CurrentFloor += 1;
    }

    public void MoveDown() {
        CurrentFloor -= 1;
    }

    public void PassengerIn(int Passenger) {
        CurrentPeople += Passenger;
        if (CurrentPeople > Capacity) {
            System.out.println("YOU HAVE REACHED MAX NUMBER OF PEOPLE");
        }
    }

    public void PassengerOut(int Passenger) {
        if (CurrentPeople - Passenger >= 0) {
            CurrentPeople -= Passenger;
        } else if (CurrentPeople - Passenger < 0) {
            System.out.println("THERE İS NOBODY TO GET OUT");
        }
    }

}
// if (Capacity > CurrentPeople + Passenger) {
//         CurrentPeople += Passenger;
//         } else if (Capacity < CurrentPeople + Passenger) {
//        System.out.println("YOU HAVE REACHED MAX NUMBER OF PEOPLE");
//        }