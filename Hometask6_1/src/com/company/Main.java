package com.company;

public class Main {

    public static void main(String[] args) {
        PassengerCar audi = new PassengerCar("Купе", 4, "Audi TT (8S)",
                9, 250, 4,245, 1365);
        audi.PrintCharacteristics();
        audi.calcDistance(2.5);

        FreightTransport truck = new FreightTransport("Volvo",35, 90, 6,
                450, 8, 10);
        truck.PrintCharacteristics();
        truck.checkCapacity(10);

        CivilAirTransport airplane = new CivilAirTransport(277,"Boeing 737-300",
                795, 52500, 29, 2000,true);
        airplane.PrintCharacteristics();
        airplane.checkNumOfPassengers(500);

        MilitaryAirTransport helicopter = new MilitaryAirTransport(2, true,"Ка-50",
        300, 9800, 5, 0);
        helicopter.PrintCharacteristics();
        helicopter.shot();
        helicopter.shot();
        helicopter.shot();
        helicopter.ejection();
    }
}
