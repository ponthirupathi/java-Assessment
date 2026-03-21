package Day_11;

import java.util.Scanner;

public class Pattern_5 {
    
     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your row :");
        int row  = sc.nextInt();
 
        int temp = 1;
        for(int i = 1 ; i<= row ; i++){

            for(int j = 1 ; j <= i ; j++){

                System.out.print(temp+" ");
                temp++;
            
        }
        System.out.println();
        }

    }
}
