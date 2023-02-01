package com.practice2;

public class OOPs_St {
    static class Car {
        String color;
        int price;
/*        Car(String color, int price) {
            this.color = colo33r;
            this.price = price;
        }
 */
    }


    public static void main(String[] args) {
//        Car BMW = new Car("Black", 3600000);
        Car BMW = new Car();
        BMW.color = "Black";
        BMW.price = 3600000;
        System.out.println("Car { color = " + BMW.color + ", price = " + BMW.price + " }");
    }
}
