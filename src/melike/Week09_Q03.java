package melike;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Week09_Q03 {

    public static void main(String[] args) {

        List<Integer> removeAllGreaterThen100 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 101, 200, 300));

        removeAllGreaterThen100.removeIf(p -> p> 100);
        System.out.println("removeAllGreaterThen100 = " + removeAllGreaterThen100);

    }

}
/*
Given a list of Integers 1, 2, 3, 4, 5, 6, 101, 200, 300....etc. remove all values greater than 100.
 */