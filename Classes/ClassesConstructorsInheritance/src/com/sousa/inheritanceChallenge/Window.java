package com.sousa.inheritanceChallenge;

public class Window {
    private boolean isOpen;

    public Window(boolean isOpen) {
        this.isOpen = isOpen;
    }

    public boolean isOpen() {
        if (isOpen == true) {
            System.out.println("window is open");
        } else {
            System.out.println("window closed");
        }
        return isOpen;
    }


    public void setOpen(boolean open) {
        isOpen = open;
    }
}
