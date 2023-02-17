package blz.workshop.practice;

import java.util.Scanner;

public class PrintArrayUserInput {
    private static void userArray() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number value to add in array : ");
/*        int size = new Scanner(System.in).nextInt();
        int i;
        for (i = 0; i < size; i++) {
            System.out.println("Enter string :");
            String str = new Scanner(System.in).nextLine();
            System.out.println(str);
        }

        System.out.println("Number of values in array : " + i + " ");
 */
        int arraySize = scan.nextInt();
        // this is very imp. line, like if we want to print the elements from array explicitly then we have to declare
        // an array type variable to the size that we want to enter
        String[] array = new String[arraySize];
        System.out.println("Enter elements of array : ");
        for (int i = 0; i < arraySize; i++) {
            array[i] = scan.next();
        }
        System.out.println("Array Elements : ");
        for (int i = 0; i < arraySize; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    public static void main(String[] args) {
        PrintArrayUserInput.userArray();
    }
}