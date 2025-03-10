package com.study.repeating_switch;

import static com.study.repeating_switch.ParrotTypeEnum.AFRICAN;

public class AfricanParrot extends Parrot {

    protected final int numberOfCoconuts;

    public AfricanParrot(int numberOfCoconuts) {
        super(AFRICAN);
        this.numberOfCoconuts = numberOfCoconuts;
    }

    @Override
    public double getSpeed() {
        return Math.max(0, getBaseSpeed() - getLoadFactor() * numberOfCoconuts);
    }

    @Override
    public String getCry() {
        return "Sqaark!";
    }
}
