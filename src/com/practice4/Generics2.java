package com.practice4;

/**
 * @author Shashank
 */
public class Generics2 {
    public static void main(String[] args) {
        GenericClass<Integer> integerGenericClass = new GenericClass<>(12);
        GenericClass<String> stringGenericClass = new GenericClass<>("Sharanya");

        System.out.println(integerGenericClass.getData());
        System.out.println(stringGenericClass.getData());
    }
}

class GenericClass<T> {
    private final T data;

    GenericClass(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}