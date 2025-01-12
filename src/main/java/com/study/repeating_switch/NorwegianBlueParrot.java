package com.study.repeating_switch;

import static com.study.repeating_switch.ParrotTypeEnum.NORWEGIAN_BLUE;

public class NorwegianBlueParrot extends Parrot {

    public NorwegianBlueParrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
        super(type, numberOfCoconuts, voltage, isNailed);
    }

    @Override
    public double getSpeed() {
        return (isNailed) ? 0 : getBaseSpeed(voltage);
    }

    @Override
    public String getCry() {
        return switch (NORWEGIAN_BLUE) {
            case EUROPEAN -> "Sqoork!";
            case AFRICAN -> "Sqaark!";
            case NORWEGIAN_BLUE -> voltage > 0 ? "Bzzzzzz" : "...";
        };
    }
}