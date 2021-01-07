package com.tms;

public abstract class Shape {


    abstract double getVolume();
    public String shapeName;

    public String getShapeName() {
        return shapeName;
    }
    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }


}
