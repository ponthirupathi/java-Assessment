package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Task_4 {
     public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(2);
        list.add(8);
        list.add(1);
        list.add(3);
        Collections.sort(list);
        System.out.println("the secound lagest numbes is"+list.get(list.size()-2));
     }
}
