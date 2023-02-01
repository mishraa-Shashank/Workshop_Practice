package com.practice5.dsa;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author Shashank
 */
public class Marbles {
    static List<Marble> list = new ArrayList<>();

    static void addMarble() {

        Marble marble = new Marble();
        marble.color = Marble.Color.RED;
        marble.price = 100;

        Marble marble1 = new Marble();
        marble1.color = Marble.Color.BLUE;
        marble1.price = 120;

        Marble marble2 = new Marble();
        marble2.color = Marble.Color.GREEN;
        marble2.price = 150;

        Marble marble3 = new Marble();
        marble3.color = Marble.Color.YELLOW;
        marble3.price = 180;

        Marble marble4 = new Marble();
        marble4.color = Marble.Color.RED;
        marble4.price = 80;

        Marble marble5 = new Marble();
        marble5.color = Marble.Color.BLUE;
        marble5.price = 140;

        Marble marble6 = new Marble();
        marble6.color = Marble.Color.GREEN;
        marble6.price = 170;

        Marble marble7 = new Marble();
        marble7.color = Marble.Color.YELLOW;
        marble7.price = 200;

        list.add(marble);
        list.add(marble1);
        list.add(marble2);
        list.add(marble3);
        list.add(marble4);
        list.add(marble5);
        list.add(marble6);
        list.add(marble7);
    }

    static void printMarbles() {
//        list.forEach(System.out::println);
        for (Marble m : list){
            System.out.println(m);
        }
    }

    static void minRedPrice() {
        System.out.print("\nMinimum price of red marble : ");
        list.stream().filter(marble -> marble.color.equals(Marble.Color.RED))
                .min(Comparator.comparing(Marble::getPrice)).ifPresent(System.out::println);
/*        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println("\nPrint yellow marbles : ");
        list.stream().filter(marble -> marble.color.equals(Marble.Color.YELLOW)).forEach(System.out::println);

        System.out.println("\nPrint blue marbles : ");
        list.stream().filter(marble -> marble.color.equals(Marble.Color.BLUE)).forEach(System.out::println);

        System.out.println("\nPrint green marbles : ");
        list.stream().filter(marble -> marble.color.equals(Marble.Color.GREEN)).forEach(System.out::println);
 */
    }

    static void minYellowPrice() {
        System.out.print("\nMinimum price of yellow marble : ");
        list.stream().filter(marble -> marble.color.equals(Marble.Color.YELLOW))
                .min(Comparator.comparing(Marble::getPrice)).ifPresent(System.out::println);
    }

    static void minBluePrice() {
        System.out.print("\nMinimum price of blue marble : ");
        list.stream().filter(marble -> marble.color.equals(Marble.Color.BLUE))
                .min(Comparator.comparing(Marble::getPrice)).ifPresent(System.out::println);
    }

    static void minGreenPrice() {
        System.out.print("\nMinimum price of blue marble : ");
        list.stream().filter(marble -> marble.color.equals(Marble.Color.GREEN))
                .min(Comparator.comparing(Marble::getPrice)).ifPresent(System.out::println);
    }

    static void minPrice() {
        System.out.print("\nThe minimum price of marble from the list : ");
        list.stream().min(Comparator.comparing(Marble::getPrice)).ifPresent(System.out::println);
    }
}
