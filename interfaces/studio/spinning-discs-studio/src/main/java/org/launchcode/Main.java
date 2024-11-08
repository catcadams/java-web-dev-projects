package org.launchcode;

public class Main {
    public static void main(String[] args) {
        CD myCd = new CD("Blink-182", 50);
        DVD myDvd = new DVD("Shrek", 4);
        VinylRecord myVinyl = new VinylRecord("Nickleback", 15, 12, 45);
        FloppyDisk myFloppy = new FloppyDisk("Windows 95", .87);

        myDvd.spinDisk();
        myCd.spinDisk();
        myVinyl.spinDisk();
        myFloppy.spinDisk();

        System.out.println();
        myDvd.storageCapacity();
        myCd.storageCapacity();
        myVinyl.storageCapacity();
        myFloppy.storageCapacity();

        System.out.println();
        myDvd.pressPlay();
        myCd.pressPlay();
        myVinyl.pressPlay();
        myFloppy.pressPlay();
        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.
    }
}