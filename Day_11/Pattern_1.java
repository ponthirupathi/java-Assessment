package Day_11;

import java.util.Scanner;

public class Pattern_1 {

        public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your row :");
        int row  = sc.nextInt();
        
        for(int i = 1 ; i<= row ; i++){
            
        if(i==1 || i==5){
                  for(int k = 1 ; k<= row ; k++){
                      System.out.print("*");
            
        }
        }
        if(i==2 ||i==3 || i==4){

            
                  for(int k = 1 ; k<= row ; k++){

               if(k==2||k==3||k==4){
                  System.out.print(" ");
               }else{
                System.out.print("*");
               }

            
        }
        }
     
        System.out.println();
        }}
    }
    

