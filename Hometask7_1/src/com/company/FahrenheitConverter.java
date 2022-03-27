package com.company;

public class FahrenheitConverter implements Converter{
    @Override
    public double convert(double baseValue) {
        return 1.8 * baseValue + 32;
    }
}
