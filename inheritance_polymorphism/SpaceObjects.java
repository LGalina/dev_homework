package com.oop.inheritance_polymorphism;


public abstract class SpaceObjects {


    //Manhattan distance
    public double calcDistance(Point point1, Point point2){
        return  (Math.abs(point1.getX() - point2.getX()) + Math.abs(point1.getY() - point2.getY())) ;
    }

    public abstract boolean compareObject(SpaceObjects spaceObjects);

}
