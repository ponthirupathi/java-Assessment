package Day_12;
import java.util.Scanner;

public class Pattern_1 {

        public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your row :");
        int row  = sc.nextInt();
        
        for(int i = 1 ; i<= row ; i++){

            if(i==1 || i == 10){

            for(int y = 1 ; y<=row ; y++){

                
                System.out.print("*");
            }
        }
            if(i==2|| i == 9){

            for(int y = 1 ; y<=row ; y++){

                if(y == 5 || y == 6){
                    System.out.print(" ");
                }else{
                   System.out.print("*");
                }
                
               
            }
        }

          if(i==3|| i == 8){

            for(int y = 1 ; y<=row ; y++){

                if(y == 4 || y == 5||y==6||y==7){
                    System.out.print(" ");
                }else{
                   System.out.print("*");
                }
                
               
            }
        }

          if(i==4|| i == 7){

            for(int y = 1 ; y<=row ; y++){

                if(y==8||y==3||y == 4 || y == 5||y==6||y==7){
                    System.out.print(" ");
                }else{
                   System.out.print("*");
                }
                
               
            }
        }
          if(i==5|| i == 6){

            for(int y = 1 ; y<=row ; y++){

                if(y==2|| y==3||y==8||y==9||y == 4 || y == 5||y==6||y==7){
                    System.out.print(" ");
                }else{
                   System.out.print("*");
                }
                
               
            }
        }
            
        System.out.println();
        }}
    }
    

