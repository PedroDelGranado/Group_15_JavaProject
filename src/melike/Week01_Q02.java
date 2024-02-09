package melike;

public class Week01_Q02 {


    /* Write a method that can divide two numbers without using division operator */

    public static void main(String[] args) {

        divideNumbers(15,5);

    }

    public static void divideNumbers(int num1, int num2){

        int count = 0;
        while(num1 >= num2){

            num1 = num1-num2;
            count++;
        }

        System.out.println(count);
    }


}
