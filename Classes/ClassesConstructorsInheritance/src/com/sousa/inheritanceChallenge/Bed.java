package com.sousa.inheritanceChallenge;

public class Bed {
    private String style;
    private int pillows;
    private int height;

    public Bed(String style, int pillows, int height) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
    }

    public void make() {
        System.out.println("making bed");
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public int getPillows() {
        return pillows;
    }

    public void setPillows(int pillows) {
        this.pillows = pillows;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
