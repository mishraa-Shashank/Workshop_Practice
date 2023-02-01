package com.practice4;

//import java.util.Arrays;

/**
 * @author Shashank
 */
public class Generics1 {
    public <E> void myMethod(E[] e) {
        for (E value : e) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 6, 4};
        String[] strings = {"Shashank", "Shubhanshu", "Pandey", "Sharanya"};

//        System.out.println(Arrays.toString(integers));
//        System.out.println(Arrays.toString(strings));

        Generics1 generics1 = new Generics1();
        generics1.myMethod(integers);
        generics1.myMethod(strings);
    }
}