package Array;
import java.util.Scanner;
public class Task_3 {
 
    public static void main(String[]gd){


        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int avg = 0;

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

            sum = sum + Array[i];


            avg = sum/arr_size;
        }
        
        System.out.println("the sum of Array values : "+sum);
        System.out.println("the avarege of Array values :"+avg);
    
    }
}
