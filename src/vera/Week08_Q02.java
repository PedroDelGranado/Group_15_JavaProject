package vera;

import java.util.ArrayList;
import java.util.List;

public class Week08_Q02 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Ahmed");
        names.add("John");
        names.add("Eric");
        names.add("Ahmed");
        names.add("Ahmed");
        names.add("Aaron");
        names.add("Ahmed");
        System.out.println("names = " + names);
        
        List<String> names2 = new ArrayList<>();
        for (String each : names){
            if (!(each.equals("Ahmed"))){
                names2.add(each);
            }
        }
        System.out.println("names2 = " + names2);
    }
}
/*Given a list of people names: "Ahmed", "John", Eric", "Ahmed", "Aaron".....
Write a java operation to remove all the names named Ahmed*/