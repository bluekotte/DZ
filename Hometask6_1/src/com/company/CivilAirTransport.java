package com.company;

public class CivilAirTransport extends AirTransport {
    int numOfPassengers;
    boolean  businessClass;

    public CivilAirTransport(int numOfPassengers, String Model, int maxSpeed,
                             int weight, int wingspan, int minRunwayLengthForTakeoff,
                             boolean businessClass) {
        this.numOfPassengers = numOfPassengers;
        super.setModel(Model);
        super.setMaxSpeed(maxSpeed);
        super.setWeight(weight);
        super.setWingspan(wingspan);
        super.setMinRunwayLengthForTakeoff(minRunwayLengthForTakeoff);
        this.businessClass = businessClass;
    }
    void PrintCharacteristics() {
        System.out.printf("Самолет %s, количество пассажиров %d, максимальная скорость %d км/ч, масса %d кг," +
                " размах крыла %d м, минимальная длина взлетно-посадочной полосы для взлета %d," +
                " наличие бизнес-класса %b%n", getModel(), numOfPassengers, getMaxSpeed(), getWeight(), getWingspan(),
                getMinRunwayLengthForTakeoff(), businessClass);
    }

    boolean checkNumOfPassengers (int passengers){
        if (passengers > numOfPassengers) {
            System.out.println("Вам нужен самолет побольше");
            return false;
        }
        else {
            System.out.println("Самолет загружен");
            return true;
        }
    }
}
