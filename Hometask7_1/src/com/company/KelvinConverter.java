package com.company;

public class KelvinConverter implements Converter{
    @Override
    public double convert(double baseValue) {
        return baseValue + 273.15;
    }
}
