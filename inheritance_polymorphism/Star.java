package com.oop.inheritance_polymorphism;

public class Star extends Objects implements Positionable{
    private double temperature;

    public Star() {
    }
    public Star(double temperature) {
        this.temperature = temperature;
    }

    public Star(String name, double weight, double temperature) {
        super(name, weight);
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
    @Override
    public boolean compareObject(SpaceObjects spaceObjects) {
        if (this == spaceObjects) return true;
        if (!(spaceObjects instanceof Star that)) return false;
        return getWeight() == that.getWeight();
    }
    @Override
    public Point getPosition() {
        return getPoint();
    }


}
