package avdo;

public class Java_Weeks1Q2 {
    public static class DivisionWithoutDivisionOperator {
        public static void main(String[] args) {
            int dividend = 15;
            int divisor = 3;

            int result = divide(dividend, divisor);

            System.out.println(dividend + " / " + divisor + " = " + result);
        }

        public static int divide(int dividend, int divisor) {
            // Check for division by zero
            if (divisor == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }

            // Handle special case for Integer.MIN_VALUE
            if (dividend == Integer.MIN_VALUE && divisor == -1) {
                return Integer.MAX_VALUE;
            }

            int quotient = 0;
            int sign = (dividend < 0) ^ (divisor < 0) ? -1 : 1; // Determine the sign of the result

            dividend = Math.abs(dividend);
            divisor = Math.abs(divisor);

            while (dividend >= divisor) {
                dividend -= divisor;
                quotient++;
            }

            return sign * quotient;
        }

    }
}
