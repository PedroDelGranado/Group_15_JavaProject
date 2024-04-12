package melike;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Week09_Q02 {

    public static void main(String[] args) {

        List<String> peopleName = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed", "Aaron"));

        peopleName.removeIf(p -> p.equals("Ahmed"));

        System.out.println("peopleName = " + peopleName);


    }

}
/*
Given a list of people names: "Ahmed", "John", Eric", "Ahmed", "Aaron".....
Write a java operation to remove all the names named Ahmed

 */