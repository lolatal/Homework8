package com.tms;

import java.util.ArrayList;

public class Box extends Shape {
    public ArrayList<Shape> shapes = new ArrayList<>();
    private double spaceAvailable;
    private double volume;

    public Box(double available, String shapeName) {
        super(shapeName);
        this.spaceAvailable = available;
        this.volume = available;
    }

    public double getVolume() {
        return volume;
    }

    public boolean add(Shape shape) {
        if (spaceAvailable >= shape.getVolume()) {
                shapes.add(shape);
                spaceAvailable -= shape.getVolume();
                System.out.println("Оставшийся объем в контейнере: " + spaceAvailable);
                return true;
        }else{
                return false;
            }
        }
    }


