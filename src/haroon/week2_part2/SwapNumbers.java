package haroon.week2_part2;

public class SwapNumbers {

    public static void main(String[] args) {

        int a = 5;
        int b = 10;

        // Swap using arithmetic operations
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping - a: " + a + ", b: " + b);
    }

}

/*
Swap two variables' values without using a third variable
 */
