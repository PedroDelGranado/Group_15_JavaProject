package kerim;

public class Week01_Question02 {

    // ***

    public static int divideWithoutOperator( double number1, double number2) {

        if (number2 == 0) {
            throw new RuntimeException("Number can not be divided by zero");
        }
        int posNeg = 1;
        if ((number1 < 0 && number2 > 0) || (number1 > 0 && number2 < 0)) {
            posNeg = -1;
        }

        double absNum1 = Math.abs(number1);
        double absNum2 = Math.abs(number2);

            int result = 0;
        while (absNum1 >= absNum2) {
            absNum1 -= absNum2;
            result++;
        }

            return result * posNeg;
        }

}



/*
Write a method that can divide two numbers without using division operator
 */