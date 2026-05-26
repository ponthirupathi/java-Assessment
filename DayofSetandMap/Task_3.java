package DayofSetandMap;

import java.util.HashMap;

public class Task_3 {
    
    public static void main(String[] args) {
        String str = "aabbc";
        int count =1;

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i< str.length();i++){

           if(i < str.length() - 1 && str.charAt(i) == str.charAt(i+1)){
            count ++;
            
           }else{
            System.out.println(str.charAt(i)+count);
            count=1;
           }

           
        }
    }
}
