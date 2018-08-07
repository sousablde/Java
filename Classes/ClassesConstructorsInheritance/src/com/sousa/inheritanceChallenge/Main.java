package com.sousa.inheritanceChallenge;
/*
Challenge.
Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
Finally, create another class, a specific type of Car that inherits from the Car class.
You should be able to hand steering, changing gears, and moving (speed in other words) .
You will want to decide where to put the appropriate state and behaviours (fields and methods).
AS mentioned above, changing gears, increasing/decreasing speed should be included.
For you specific type of vehicle you will want to add something specific for that type of car.
 */

/*
second challenge
Create a single room of a house using composition.
Think about the things that should be included in the room.
Maybe physical parts of the house but furniture as well
Add at least one method to access an object via a getter and
then that objects public method as you saw in the previous video
then add at least one method to hide the object e.g. not using a getter
but to access the object used in composition within the main class
like you saw in this video.
 */

public class Main {
    public static void main(String[] args) {
        Opel opel = new Opel(36);
        opel.accelerate(30);

        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("2208", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.getMonitor().drawPixelAt(1500, 1200, "red");
        thePC.getMotherboard().loadProgram("Windows 1.0");
        thePC.getTheCase().pressPowerButton();

        Window window1 = new Window(true);
        Window window2 = new Window(false);

        Bed bed = new Bed("Modern", 3, 2);

        Lamp lamp = new Lamp("classic", false);

        Bedroom bedroom = new Bedroom("My Bedrom", window1, window2, bed, lamp);
        bedroom.makeBed();

        bedroom.getLamp().turnOn();
        window1.setOpen(true);
        window1.isOpen();





    }
}


