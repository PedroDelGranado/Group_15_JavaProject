package AliDemir;

public class Week3_Qall {


    public static void main(String[] args) {

        for (int i = 0; i < 6; i++) {
            System.out.println("is number "+ i + " prime : "+ isPrime(i));
        }

        System.out.println("==========================================");

        int[] reversedNumber = {15, -15, 123, -123};
        for (int each : reversedNumber) {
            System.out.println("Reversed number(only for negatives): " + reverseNegative(each) + " ----- actual number : "+ each);
        }
    }


    public static boolean isPrime(int number){
        if(number <=1){
            return false;
        }

        for (int i = 2; i < number; i++) {

            if(number%i ==0){
                return false;
            }
        }
        return true;
    }

    //------------------------PART2-----------------------------

    public static int reverseNegative(int number) {
        if (number >= 0) {
            return number;
        }
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }
}

/*
1.Write a method that can check if a number is prime or not

2.Write a return method that can reverse negative number and return it as int
 */