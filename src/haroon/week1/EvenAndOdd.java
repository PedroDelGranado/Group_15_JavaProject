package haroon.week1;

public class EvenAndOdd {
    public static void main(String[] args) {

        int number = 6;
        boolean isEven = number % 2 == 0;
        boolean isOdd = !isEven;

        System.out.println(number + " is an even number " + isEven);
        System.out.println(number + " is an odd number " + isOdd);

        System.out.println("-----------------------------------------------------------------------");

        int number1 = 5; // You can change the number to test different values

        if (number1 % 2 == 0) {
            System.out.println(number1 + " is an even number");
        } else {
            System.out.println(number1 + " is an odd number");





        }

    }

}
