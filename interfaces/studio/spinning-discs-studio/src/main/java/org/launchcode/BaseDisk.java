package org.launchcode;

public abstract class BaseDisk {

    private double Capacity;
    private String Name;

    public BaseDisk(String name, double capacity) {
        Name = name;
        Capacity = capacity;
    }

    public double getCapacity() {
        return Capacity;
    }

    public String getName() {
        return Name;
    }

    abstract void spinDisk();

}
