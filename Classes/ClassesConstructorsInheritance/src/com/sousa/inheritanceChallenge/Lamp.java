package com.sousa.inheritanceChallenge;

public class Lamp {
    private String style;
    private boolean battery;

    public Lamp(String style, boolean battery) {
        this.style = style;
        this.battery = battery;
    }

    public void turnOn() {
        System.out.println("Lamp is on ");
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public boolean isBattery() {
        return battery;
    }

    public void setBattery(boolean battery) {
        this.battery = battery;
    }
}
