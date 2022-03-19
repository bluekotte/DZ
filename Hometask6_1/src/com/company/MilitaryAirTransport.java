package com.company;

public class MilitaryAirTransport extends AirTransport {
    boolean ejectionSystem;
    int numOfMissiles;

    public MilitaryAirTransport(int numOfMissiles, boolean ejectionSystem, String Model,
                                int maxSpeed, int weight, int wingspan,
                                int minRunwayLengthForTakeoff) {
        this.numOfMissiles = numOfMissiles;
        this.ejectionSystem = ejectionSystem;
        super.setModel(Model);
        super.setMaxSpeed(maxSpeed);
        super.setWeight(weight);
        super.setWingspan(wingspan);
        super.setMinRunwayLengthForTakeoff(minRunwayLengthForTakeoff);
    }

    void PrintCharacteristics() {
        System.out.printf("Вертолет %s, максимальная скорость %d км/ч, масса %d кг, размах крыла %d м, " +
                "минимальная длина взлетно-посадочной полосы для взлета %d, количество ракет %d, " +
                "система катапультирования %b%n", getModel(), getMaxSpeed(), getWeight(), getWingspan(), getMinRunwayLengthForTakeoff(),
                numOfMissiles, ejectionSystem);
    }

    void shot() {
        if(numOfMissiles > 0){
            System.out.println("Ракета пошла");
            numOfMissiles--;
        }
        else{
            System.out.println("Боеприпасы отсутствуют");
        }
    }

    void ejection() {
        if(ejectionSystem){
            System.out.println("Катапультирование прошло успешно");
        }
        else {
            System.out.println("У Вас нет такой системы");
        }
    }
}
