package org.launchcode;

public class CD extends BaseDisk implements OpticalDisk {


    public CD(String name, double capacity) {
        super(name, capacity);
    }

    @Override
    public void spinDisk() {
        System.out.println("A CD spins at a rate of 200 - 500 rpm.");
    }

    @Override
    public void storageCapacity() {
        System.out.println("Storage used: " + getCapacity() + "MB of 700MB");

    }

    @Override
    public void pressPlay() {
        System.out.println("Now listening to: " + getName());
    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
