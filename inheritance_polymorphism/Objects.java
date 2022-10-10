package com.oop.inheritance_polymorphism;

class Objects extends  SpaceObjects {
    private Point point;
    private String name;
    private double weight;

    public Objects() {
    }

    public Objects(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean compareObject(SpaceObjects spaceObjects) {
        if (this == spaceObjects) return true;
        if (!(spaceObjects instanceof Objects that)) return false;
        return weight == that.weight;
    }

    @Override
    public String toString() {
        return "Objects{" +
                "point=" + point +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
