package blz.workshop.practice;

import java.util.Scanner;

public class ReadFirstChar {

    public static void main(String[] args) {
        System.out.println("Enter a string:");
        Scanner scan = new Scanner(System.in);
        char ch = scan.next().charAt(0);
//        String ch = String.valueOf(scan.next().charAt(0));
        System.out.println("Ans : " + ch);

    }
}
