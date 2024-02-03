package vera;

import java.util.Scanner;

public class Week01_Q02 {
    public static double divisionOfTwo(double n1, double n2) {
        if (n1 == 0) {
            return 0;
        }
        if (n2 == 0) {
            System.err.println("Cannot divide by zero");
        }


        double result = 0;
        while (n1 >= n2) {
            n1 = n1 - n2;
            result++;
        }
        return result;
    }



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number: ");
        double n1 = input.nextDouble();

        System.out.println("Enter your second number: ");
        double n2 = input.nextDouble();


        System.out.println(divisionOfTwo(n1, n2));

        input.close();


    }


}
/*Write a method that can divide two numbers without using division operator*/
