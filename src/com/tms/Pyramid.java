package com.tms;

public class Pyramid extends Shape{
    double baseArea;
    double h;

    public Pyramid(String shapeName, double baseArea, double h){
        super(shapeName);
        this.baseArea = baseArea;
        this.h = h;
    }
    public double getVolume () {
        var volume = baseArea*h/3;
        return volume;
    }


}
