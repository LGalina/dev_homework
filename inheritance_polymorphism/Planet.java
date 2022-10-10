package com.oop.inheritance_polymorphism;

public class Planet extends Objects {
    private int speed;

    public Planet() {
    }

    public Planet(String name, double weight, int speed) {
       super();
       this.speed = speed;
    }

    @Override
    public boolean compareObject(SpaceObjects spaceObjects) {
        if (this == spaceObjects) return true;
        if (!(spaceObjects instanceof Planet that)) return false;
        return getWeight() == that.getWeight();
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "speed=" + speed +
                ", name='" + getName() + '\'' +
                ", weight=" + getWeight() +
                '}';
    }
}
