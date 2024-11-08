package org.launchcode;

public class DVD extends BaseDisk implements OpticalDisk {

    public DVD(String name, double capacity) {
        super(name, capacity);
    }

    @Override
    public void spinDisk() {
        System.out.println("A DVD spins at a rate of 570 - 1600 rpm.");
    }

    @Override
    public void storageCapacity() {
        System.out.println("Storage used: " + getCapacity() + "GB of 17GB");
    }

    @Override
    public void pressPlay() {
        System.out.println("Now watching: " + getName());
    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
