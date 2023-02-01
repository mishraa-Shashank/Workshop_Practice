package com.practice2;

import java.util.ArrayList;
import java.util.List;

public class OOPs_St2 {
    static List<OOPs_St2> list = new ArrayList<>();
    enum Color{
        BLACK, RED, YELLOW, ORANGE
    }
    enum Car{
        BMW, FERRARI, SUV, THAR
    }
    Color color;
    Car car;

    @Override
    public String toString() {
        return "OOPs_St2 {" +
                "color = " + color +
                ", car = " + car +
                '}';
    }

    public static void main(String[] args) {

//        Car car1 = new Car();
        OOPs_St2 car1 = new OOPs_St2();
        car1.color = Color.RED;
        car1.car = Car.BMW;

        OOPs_St2 car2 = new OOPs_St2();
        car2.color = Color.YELLOW;
        car2.car = Car.FERRARI;

        list.add(car1);
        list.add(car2);
        for (OOPs_St2 data : list) {
            System.out.println(data);
        }
    }
}
