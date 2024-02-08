package dilara;

public class Week1_Question2 {

    public static void main(String[] args) {

        divide2numbersWithoutDivisionOperator(-4, -2);

    }


    public static void divide2numbersWithoutDivisionOperator(double dividend, double divisor) {

        double Absdividend = Math.abs(dividend);
        double Absdivisor = Math.abs(divisor);


        int count = 0; // quotient


        while (Absdividend >= Absdivisor) {

            Absdividend -= Absdivisor;
            count++;

        }

        if( dividend * divisor < 0 ){

            count *= -1;

        }

        System.out.println(count);

    }


}
//Question_02
//        ```
//        Write a method that can divide two numbers without using division operator
