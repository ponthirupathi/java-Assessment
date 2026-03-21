package Day_11;

import java.util.Scanner;

public class Pattern_2 {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your row :");
        int row  = sc.nextInt();
         int num =1;
         int s = row -1 ;

        for(int i = 1 ; i<= row ; i++)
            {
        for(int k = 1;k <= s;k++){
            System.out.print(" ");
        }
               
               

            for(int j = 1 ; j<= i ; j++){

                // for(int z =3; z>=j; z--){
                //     System.out.print(" ");
                // }
               
                
              
                System.out.print(num+" ");
                  
                
            
            
        }
        s--;
         num++;
        System.out.println();
        }

    }
    
}
