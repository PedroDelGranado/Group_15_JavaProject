package vera;

import java.util.ArrayList;
import java.util.List;

public class Week08_Q03 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(101);
        list.add(200);
        list.add(300);
        System.out.println("list = " + list);
        
        List<Integer> list2 = new ArrayList<>();
        for(Integer each:list){
            if (each <= 100){
                list2.add(each);
            }
        }
        System.out.println("list2 = " + list2);
    }
}

/*Given a list of Integers 1, 2, 3, 4, 5, 6, 101, 200, 300....etc. remove all values greater than 100.*/