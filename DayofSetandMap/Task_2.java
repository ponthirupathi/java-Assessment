package DayofSetandMap;

import java.util.HashSet;

public class Task_2 {
    
    public static void main(String[]hgvds){

        HashSet<Integer> set = new HashSet<>();

        int n =10;
        set.add(1);
        set.add(2);
        set.add(5);
        set.add(8);
        set.add(9);
    

        for(int i=1; i<=n; i++){
            if(!set.contains(i)){
                System.out.println("the missing number are :"+ i);
            }
        }
    }
}

