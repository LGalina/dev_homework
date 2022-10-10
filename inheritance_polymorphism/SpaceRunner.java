package com.oop.inheritance_polymorphism;

public class SpaceRunner {
    public static void main(String[] args) {
        Planet planet = new Planet("Mars", 6.42, 24);
        Star star = new Star("Leo", 2, 156);
        Satellite satellite = new Satellite(SatellitType.natural);
        System.out.println(SpaceUtils.isStar(star));
        System.out.println(planet.calcDistance(new Point(2,3), new Point(78, 96)));
        System.out.println(star.toString());


    }
}
