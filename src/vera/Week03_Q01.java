package vera;

public class Week03_Q01 {

    public static void main(String[] args) {


        System.out.println(isPrime(5));
        System.out.println(isPrime(4));
    }

    public static boolean isPrime(int num){
        if(num < 2){
            return false;
        }

        for (int i = 2; i < num; i++) {
            if(num % i == 0){
                return false;
            }

        }
        return true;
    }


}
//Write a method that can check if a number is prime or not