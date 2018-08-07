package com.sousa.inheritanceChallenge;

public class Opel extends Car {
    private int roadService;

    public Opel(int roadService) {
        super("Opel", "4WD", 5, 5, 6, false);
        this.roadService = roadService;
    }

    public void accelerate(int rate) {
        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity == 0) {
            stop();
            setCurrentGear(1);
        } else if (newVelocity > 0 && newVelocity <= 10) {
            setCurrentGear(1);
        } else if (newVelocity > 10 && newVelocity <= 20) {
            setCurrentGear(2);
        } else if (newVelocity > 20 && newVelocity <= 30) {
            setCurrentGear(3);
        } else if (newVelocity > 30 && newVelocity <= 40) {
            setCurrentGear(4);

        } else {
            setCurrentGear(4);
        }
        if (newVelocity > 0) {
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }
}
