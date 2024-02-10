package melike;

public class Week03_Q01 {

    public static void main(String[] args) {


        System.out.println(isPrime(6));

    }

    public static boolean isPrime(int number){

        if(number > 2){
            return false;
        }

        for(int i = 0; i < number; i++){
            return false;
        }

        return true;

    }
}

/*
A number is prime if it is only divisible by one and itself
 Ex:
            7 -> prime, because only 1 and 7 can be divided evenly
            6 -> not prime, because 6 is divisible by 2 and 3 also
 */
