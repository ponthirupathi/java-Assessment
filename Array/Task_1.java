package Array;
import java.util.Scanner;
public class Task_1 {
 
    public static void main(String[]gd){


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Array Size : ");
        int arr_size = sc.nextInt();

        System.out.println("Enter the Array values :");
        int Array[] = new int[arr_size];

        for(int i = 0; i< arr_size; i++){

            Array[i] = sc.nextInt();            
        }
    System.out.println("the array values:");
        for(int i = 0 ; i<arr_size; i++){

            System.out.print("{"+Array[i]+"}");
        }
        
        
    
    }
}
