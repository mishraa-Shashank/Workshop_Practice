package blz.workshop.practice;

/**
 * @author Shashank
 */
public class ReadChar {
    public static void main(String[] args) {
/*        String str = "Shashank. I am a good boy.";
        System.out.print("\n[ ");
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.print(" ]");
 */

        // // Reading chars using Stream API in Java 8
        String charReading = "Shashank & I am a good boy";
//        System.out.print("\n[ ");
        charReading.chars().forEach(chars -> System.out.print((char) chars + " "));
//        System.out.print(" ]");
    }
}