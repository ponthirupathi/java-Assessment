package String;
//Reverse the given string.

public class Task_3 {

    public static void main(String[]args){
    String str = "hello";
    int length = str.length();
   String temp = "";
    for(int i = length -1;  i > 0;i--){
      
    temp +=  str.charAt(i); 
    }
    System.out.println(temp);
    }
}
