package com.company;

public class PassengerCar extends GroundTransport {
    String bodyType;
    int numOfPassengers;

    public PassengerCar(String bodyType, int numOfPassengers, String Model, int fuelConsumption, int maxSpeed,
                        int numOfWheels, int power, int weight) {
        this.bodyType = bodyType;
        this.numOfPassengers = numOfPassengers;
        super.setModel(Model);
        super.setFuelConsumption(fuelConsumption);
        super.setMaxSpeed(maxSpeed);
        super.setNumOfWheels(numOfWheels);
        super.setPower(power);
        super.setWeight(weight);
    }

    void PrintCharacteristics() {
        double powerKv = this.PowerKv();
        System.out.printf("Автомобиль %s, кузов %s, количество пассажиров %d,количество колес %d," +
                "мощность %d л/с, расход топлива %d л/100км, максимальная скорость %d км/ч," +
                "масса %d кг, мощность в киловаттах %.2f%n", getModel(), bodyType, numOfPassengers, getNumOfWheels(),
                getPower(), getFuelConsumption(), getMaxSpeed(), getWeight(), powerKv);
    }

    void calcDistance(double time) {
        double distance = time * getMaxSpeed();
        double fuelUsed = this.calcFuelConsumption(getFuelConsumption(), distance);
        System.out.printf("За время %.2f ч автомобиль %s двигаясь с максимальной скоростью %d км/ч" +
                "проедет %.2f км и израсходует %.2f литров топлива%n", time, getModel(), getMaxSpeed(), distance, fuelUsed);
    }

    private double calcFuelConsumption(int fuelConsumption, double distance){
        return fuelConsumption * distance / 100;
    }
}
