package Day_12;
import java.util.Scanner;

public class Pattern_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the row size:");
        int row = sc.nextInt();
         for(int i =1 ; i <=row ; i++){

            for(int j=1;j<=i;j++){

                 if( i==3 && j==2|| i==4 && j==2){

                    System.out.print(" ");
                 }
                 else if(i == 4 && j==3){
                    System.out.print(" ");
                 }
                 else{
                    System.out.print("*");
                 }
                
            }
        
            System.out.println();
         }
    }
    
   
    
}
