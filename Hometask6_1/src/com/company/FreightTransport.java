package com.company;

public class FreightTransport extends GroundTransport {
    int loadCapacity;

    public FreightTransport(String Model, int fuelConsumption, int maxSpeed, int numOfWheels,
            int power, int weight, int loadCapacity) {
        super.setModel(Model);
        super.setFuelConsumption(fuelConsumption);
        super.setMaxSpeed(maxSpeed);
        super.setNumOfWheels(numOfWheels);
        super.setPower(power);
        super.setWeight(weight);
        this.loadCapacity = loadCapacity;
    }

    void PrintCharacteristics() {
        double powerKv = this.PowerKv();
        System.out.printf("Грузовик %s, количество колес %d, мощность %d л/с, расход топлива %d л/100км," +
                "максимальная скорость %d км/ч, масса %d кг, мощность в киловаттах %.2f%n", getModel(), getNumOfWheels(), getPower(), getFuelConsumption(),
                getMaxSpeed(), getWeight(), powerKv);
    }


    void checkCapacity (int capacity){
        if (capacity > loadCapacity) {
            System.out.println("Вам нужен грузовик побольше");
        }
        else {
            System.out.println("Грузовик загружен");
        }
    }
}
