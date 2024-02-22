package derya;

public class Week3_Q1PrimeNumbers {
    public static void main(String[] args) {

        System.out.println("isPrime(5) = " + isPrime(5));
        System.out.println("isPrime(12) = " + isPrime(12));

    }

    public static boolean isPrime(int n){

        if(n < 2){
            return false;
        }

        for (int i = 2; i < n; i++) {
            if(n % i == 0){
                return false;
            }

        }
        return true;
    }


}



/*
Write a method that can check if a number is prime or not
A number is prime if it is only divisible by one and itself

 */
