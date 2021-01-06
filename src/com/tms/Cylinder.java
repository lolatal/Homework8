package com.tms;

public class Cylinder extends SolidOfRevolution {
    double height;

    public Cylinder(double radius, double height, String shapeName){
        super(radius,
                shapeName);
        this.height = height;
    }
    public double getVolume (){
        var volume = 3.14*radius*radius*height;
        return volume;
    }
}
