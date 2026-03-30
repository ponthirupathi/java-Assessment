package Day_12;
import java.util.Scanner;

public class Pattern_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the row size:");
        int row = sc.nextInt();
         for(int i =1 ; i <=row ; i++){

            for(int j=row;j>=i;j--){

            if(i==2 && j==4 || i ==3 && j ==4){
                System.out.print(" ");
               
            }else if(i==2 && j==3){
               System.out.print(" ");
            }else{
                System.out.print("*");
            }
            }
            System.out.println();
         }
    }
    

    }

