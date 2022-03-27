package com.company;

public class Main {

    public static void main(String[] args) {
        double temperature = 21.5;

        KelvinConverter kelvin = new KelvinConverter();
        FahrenheitConverter fahrenheit = new FahrenheitConverter();

        System.out.println(temperature + " цельсий равно " + kelvin.convert(temperature) + " кельвин");
        System.out.println(temperature + " цельсий равно " + fahrenheit.convert(temperature) + " фаренгейт");
    }
}
