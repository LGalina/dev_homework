package com.oop.inheritance_polymorphism;

public class Satellite extends Objects implements Describable{
    private SatellitType satellitType;

    public Satellite() {
    }

    public Satellite(SatellitType satellitType) {
        this.satellitType = satellitType;
    }

    public Satellite(String name, double weight, SatellitType satellitType) {
        super(name, weight);
        this.satellitType = satellitType;
    }

    public SatellitType getSatellitType() {
        return satellitType;
    }


    @Override
    public boolean compareObject(SpaceObjects spaceObjects) {
        if (this == spaceObjects) return true;
        if (!(spaceObjects instanceof Satellite that)) return false;
        return getWeight() == that.getWeight();
    }

    @Override
    public String toString() {
        return "Satellite{" +
                "satellitType=" + satellitType +
                '}';
    }

    @Override
    public String getDescription() {
        return "are satellites of the planet " ;
    }
}
