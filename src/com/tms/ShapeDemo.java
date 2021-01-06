package com.tms;
import java.util.Scanner;
public class ShapeDemo {
    public static void main(String[] args) {
        Box box = new Box(100, "Контейнер");
        Pyramid pyramid = new Pyramid("Пимамида", 5, 4);
        Cylinder cylinder = new Cylinder(4, 2, "Цилиндр");
        Ball ball = new Ball(1, "Шар");
        System.out.println("Объем контейнера: " + box.getVolume());
        System.out.println("Объем шара: " + ball.getVolume());
        System.out.println("Объем цилиндра: " + cylinder.getVolume());
        System.out.println("Объем пирамиды: " + pyramid.getVolume());

        Shape[] shapes = new Shape[3];
        shapes[0] = ball;
        shapes[1] = cylinder;
        shapes[2] = pyramid;


        while (true) {
            System.out.println("Введите номер фигуры, объем которой будем вливать в контейнер (0, 1, или 2)");

            /* 0 - шар
            1 - цилиндр
            2 - пирамида
             */
            Scanner scanner = new Scanner(System.in);
            int inputShape = scanner.nextInt();

            boolean isSpaceEnough = true;
            if (isSpaceEnough) {
                isSpaceEnough = box.add(shapes[inputShape]);
                if (isSpaceEnough) {
                    System.out.println("Фигура " + shapes[inputShape].getShapeName() + " добавлена");
                } else {
                    System.out.println("Фигура " + shapes[inputShape].getShapeName() + " не влазит в контейнер, попробуйте другую фигуру, объем которой меньше" +
                            " оставшегося места в контейнере");
                }
            } else {
                break;
            }
        }
    }
}




