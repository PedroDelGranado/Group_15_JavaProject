package haroon.week1;

public class EvenOrOdd2 {

    public static void main(String[] args) {

        System.out.println(OddOrEven(5)); // Output: Odd
        System.out.println(OddOrEven(6)); // Output: Even

    }


    public static String OddOrEven(int number) {
        // Check if the number is even or odd
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";

        }

    }


}
