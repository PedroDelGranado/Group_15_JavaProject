package haroon.week3_part2;

public class PrimeNumber2 {

    // Method to check if a number is prime or not
    public static boolean isPrime(int number) {
        // Check if the number is less than 2
        if (number < 2) {
            return false; // Numbers less than 2 are not prime
        }

        // Check for divisibility from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // If divisible, the number is not prime
            }
        }

        return true; // If not divisible by any number, the number is prime
    }

    public static void main(String[] args) {
        int num = 19; // Example number to check
        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }

}
