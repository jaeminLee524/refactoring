package com.study.repeating_switch;

import static com.study.repeating_switch.ParrotTypeEnum.EUROPEAN;

public class EuropeanParrot extends Parrot {

    public EuropeanParrot(double voltage, boolean isNailed) {
        super(EUROPEAN, voltage, isNailed);
    }

    @Override
    public double getSpeed() {
        return getBaseSpeed();
    }

    @Override
    public String getCry() {
        return "Sqoork!";
    }
}
