package melike;

public class Week01_Q01 {

        /*
Write  a method which can identify given number is even or odd
         Output ex:
         identify(5); ->"Odd"
         identify(6); ->"Even"
 */

    public static void main(String[] args) {

        identify(5); // odd
        identify(6); // even


    }

    public static void identify(int number) {

        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
