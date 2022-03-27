package com.company;

public class FahrenheitConverter extends BaseConverter{
    @Override
    double convert(double baseValue) {
        return 1.8 * baseValue + 32;
    }
}
