package vera;

import java.util.Scanner;

public class Week01_Q01 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        System.out.println("Enter a number: ");

        if (input.hasNextInt()) {
            int num = input.nextInt();
            if (num % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }

        } else {
            System.err.println("The entered value is not a number.");
            System.exit(1);
        }

        input.close();
    }
}

