package com.company;

public class KelvinConverter extends BaseConverter{
    @Override
    double convert(double baseValue) {
        return baseValue + 273.15;
    }
}
