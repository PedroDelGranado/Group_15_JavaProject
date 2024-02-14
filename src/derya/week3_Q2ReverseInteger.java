package derya;

public class week3_Q2ReverseInteger {

    public static void main(String[] args) {

        System.out.println("reverseInt(1234) = " + reverseInt(1234));

    }
    public static int reverseInt(int n){

        int rev = 0;

       while(n > 0){
           int lastDigit = n % 10;
           rev = rev * 10 +lastDigit;
           n /=10;
       }
       return rev;

    }


}


/*
Write a return method that can reverse negative number and return it as int
 */
