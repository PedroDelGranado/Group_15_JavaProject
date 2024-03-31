package haroon.week7_part2;

import java.util.Arrays;

public class ArrayN_UniqueInteger {
        public static int[] uniqueIntegersSumToZero(int N) {
            if (N < 2 || N > 99) {
                return null;
            }

            int[] result = new int[N];

            for (int i = 0; i < N - 1; i++) {
                result[i] = i + 1;
            }
            result[N - 1] = -(N * (N - 1) / 2);

            return result;
        }

        public static void main(String[] args) {
            int N = 4;
            int[] array = uniqueIntegersSumToZero(N);
            System.out.println(Arrays.toString(array));
        }

}
