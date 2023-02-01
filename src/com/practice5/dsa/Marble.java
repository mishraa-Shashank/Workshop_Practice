package com.practice5.dsa;

/**
 * @author Shashank
 */
public class Marble {
    int price;
    enum Color{
        RED, BLUE, GREEN, YELLOW
    }
    Color color;

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Marble { " +
                "color = " + color +
                ", price = " + price +
                '}';
    }
}
