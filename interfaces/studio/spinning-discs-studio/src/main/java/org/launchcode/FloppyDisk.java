package org.launchcode;

public class FloppyDisk extends BaseDisk implements OpticalDisk {
    public FloppyDisk(String name, double capacity) {
        super(name, capacity);
    }

    @Override
    void spinDisk() {
        System.out.println("A Floppy Disk spins at a rate of 300 RPM.");
    }

    @Override
    public void storageCapacity() {
        System.out.println("Storage used: " + getCapacity() + "MB of 1.44MB.");
    }

    @Override
    public void pressPlay() {
        System.out.println("Now loading: " + getName() + ". You're soooo old.");
    }
}
