package com.tms;

public abstract class SolidOfRevolution extends Shape {
    double radius;

    public SolidOfRevolution(double radius, String shapeName){
        super(shapeName);
        this.radius = radius;

    }

    public double getRadius() {
        return radius;
    }



    abstract double getVolume();
}
