package com.study.repeating_switch;

import static com.study.repeating_switch.ParrotTypeEnum.AFRICAN;

public class AfricanParrot extends Parrot {

    public AfricanParrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
        super(type, numberOfCoconuts, voltage, isNailed);
    }

    @Override
    public double getSpeed() {
        return switch (AFRICAN) {
            case EUROPEAN -> getBaseSpeed();
            case AFRICAN -> Math.max(0, getBaseSpeed() - getLoadFactor() * numberOfCoconuts);
            case NORWEGIAN_BLUE -> (isNailed) ? 0 : getBaseSpeed(voltage);
        };
    }
}
