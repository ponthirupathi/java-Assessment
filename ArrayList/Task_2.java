package ArrayList;

import java.util.ArrayList;

public class Task_2 {
    public static void main(String[]args){

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(4);

        int count = 1;

        for(int i = 0; i<list.size()-1;i++){

            if(list.get(i).equals(list.get(i+1)) ){
                count++;               
            }else{

                
            System.out.println(list.get(i)+"->"+count);
            count = 1;
            }
        }

System.out.println(list.get(list.size() - 1) + "->" + count);
    }
}
