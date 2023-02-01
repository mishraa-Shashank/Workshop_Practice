package com.practice5.dsa;

import java.util.Scanner;

public class MarbleMain {
    public static void main(String[] args) {
/*        Marbles.addMarble();
        System.out.println("Marbles added successfully!");
        Marbles.printMarbles();
        Marbles.minRedPrice();
        Marbles.minYellowPrice();
        Marbles.minBluePrice();
        Marbles.minGreenPrice();
        Marbles.minPrice();
*/
        MarbleMain main = new MarbleMain();
        int choice;

        do {
            choice = showMenu();
            main.choose(choice);
        } while (choice != 0);
    }

    private void choose(int choice) {
        switch (choice) {
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
            default -> {
                System.out.println("Good Bye!");
            }
        }
    }

    private static int showMenu() {
        System.out.println("\nEnter 0 to Exit \n1. ADD MARBLES \n2. DISPLAY MARBLES \n3. MINIMUM RED MARBLE \n4. MINIMUM YELLOW MARBLE" +
                "\n5. MINIMUM BLUE MARBLE \n6. MINIMUM GREEN MARBLE \n7. MINIMUM PRICE \nENTER YOUR CHOICE B/W 1 - 7 : ");
        int choice;
        return choice = new Scanner(System.in).nextInt();
    }
}
