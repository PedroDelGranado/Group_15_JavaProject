package kerim;

import java.util.ArrayList;

public class Week03_Question01 {


    public static String primeOrNot(int num) {

        if (num == 1){
            return ("1 is a prime number");
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return ("Given number is not a prime number");
            }
        }
        return ("Given number is a prime number");
    }



}

/*
Write a method that can check if a number is prime or not
 */