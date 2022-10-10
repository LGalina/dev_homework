package com.oop.inheritance_polymorphism;


public final class SpaceUtils {
   final  static double GRAVITATIONAL_CONSTANT = 6.67e-11;

    public SpaceUtils() {
    }
    public static double calcGravityForces(Objects objects1, Objects objects2) {
        double distance = objects1.calcDistance(objects1.getPoint(), objects2.getPoint()) * objects2.calcDistance(objects2.getPoint(), objects2.getPoint());
        return  GRAVITATIONAL_CONSTANT * objects1.getWeight()* objects2.getWeight() / distance;
    }

    public static boolean isStar(Objects objects) {
        return objects instanceof Star;
    }
}
