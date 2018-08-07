package com.sousa.inheritanceChallenge;

public class Bedroom {
    private String name;
    private Window window1;
    private Window window2;
    private Window window3;

    private Bed bed;
    private Lamp lamp;

    public Bedroom(String name, Window window1, Window window2, Bed bed, Lamp lamp) {
        this.name = name;
        this.window1 = window1;
        this.window2 = window2;
        this.bed = bed;
        this.lamp = lamp;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public void makeBed() {
        System.out.println("making bed ");
        bed.make();
    }
}
