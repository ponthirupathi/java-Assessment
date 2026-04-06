package String;


// 2.Compress the string using character count.

// Input:

// aaabbccccd
public class Task_2{

    public static void main(String[] args) {
        
    
    String str = "aaabbcccd";
    int length = str.length()-1; 
    int count = 1;

    for(int i=0; i<length;i++){

        if(str.charAt(i)  == str.charAt(i+1)){
          count ++;
        }
        else{
            System.out.println(str.charAt(i)+"->"+count);
            count = 1;
        }

    }
System.out.print(str.charAt(length) + "->" + count);
}
}



