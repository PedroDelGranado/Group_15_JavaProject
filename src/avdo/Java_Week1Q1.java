package avdo;

import java.util.Scanner;

public class Java_Week1Q1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");

        int num = scan.nextInt();
        //int num = 5;
        //int num = 6;

        if (num%2==0){
            System.out.println("Number is even");
        }else {
            System.out.println("Number is odd");
        }
    }

}
