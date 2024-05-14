package haroon.week1;

public class DivisionWithoutOperator {

        public static void main(String[] args) {
            int dividend = 20;
            int divisor = 5;
            int quotient = 0;

            while (dividend >= divisor) {
                dividend -= divisor;
                quotient++;
            }

            System.out.println("Quotient: " + quotient);
        }

    public static int divide(int dividend, int divisor) {
        // Handle division by zero
        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return dividend;
    }
}
