package ArrayList;

import java.util.ArrayList;

public class Task_1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(2);
        list.add(5);

        int revome_element = 2;
        
        for(int i=0; i<list.size();i++){
            if(list.get(i) == revome_element){
                list.remove(i);
                i--;
            }

        }
System.out.println(list);
    }
}
