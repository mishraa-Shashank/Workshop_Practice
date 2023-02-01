package com.practice5.dsa;

import java.util.Scanner;

public class MarbleMain2 {
    public static void main(String[] args) {
        while (true){
            System.out.println("\nExit \n1. ADD MARBLES \n2. DISPLAY MARBLES \n3. MINIMUM RED MARBLE \n4. MINIMUM YELLOW MARBLE" +
                    "\n5. MINIMUM BLUE MARBLE \n6. MINIMUM GREEN MARBLE \n7. MINIMUM PRICE \nENTER YOUR CHOICE B/W 1 - 7 : ");
            int choice = new Scanner(System.in).nextInt();
            switch (choice){
                case 1 -> {
                    Marbles.addMarble();
                    System.out.println("Marbles added successfully!");
                }
                case 2 -> Marbles.printMarbles();
                case 3 -> Marbles.minRedPrice();
                case 4 -> Marbles.minYellowPrice();
                case 5 -> Marbles.minBluePrice();
                case 6 -> Marbles.minGreenPrice();
                case 7 -> Marbles.minPrice();
                case 8 -> System.exit(0);
                default -> {
                    System.out.println("Good Bye!");
                    return;
                }
            }
        }
    }
}