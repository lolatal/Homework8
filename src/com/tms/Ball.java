package com.tms;

public class Ball extends SolidOfRevolution {

    public Ball (double radius, String shapeName) {
        super (radius, shapeName);
    }
    public double getVolume(){
        var volume = 4*3.14*radius*radius*radius/3;
        return volume;
    }
}
