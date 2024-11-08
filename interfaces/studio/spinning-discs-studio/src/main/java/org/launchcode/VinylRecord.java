package org.launchcode;

public class VinylRecord extends BaseDisk implements OpticalDisk {

    private int size;
    private int speed;

    public VinylRecord(String name, double capacity, int size, int speed) {
        super(name, capacity);
        this.size = size;
        this.speed = speed;
    }

    @Override
    void spinDisk() {
        System.out.println("A Vinyl spins at a rate of " + speed + "RPM");
    }

    @Override
    public void storageCapacity() {
        if ( size == 12 && speed == 33) {
            System.out.println("This holds 20 minutes of music per side!");
        } else if (size == 12 && speed == 45) {
            System.out.println("This holds 15 minutes of music per side!");
        } else {
            System.out.println("What kind of record is this?!");
        }

    }

    @Override
    public void pressPlay() {
        System.out.println("Now listening to: " + getName() + " on vinyl. You're so cool!");
    }
}
