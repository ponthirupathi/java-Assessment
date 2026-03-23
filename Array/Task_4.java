package Array;

import java.util.Scanner;
public class Task_4 {
 
    public static void main(String[]gd){


        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter your Array Size : ");
        int arr_size = sc.nextInt();

        System.out.println("Enter the Array values :");
        int Array[] = new int[arr_size];

        for(int i = 0; i< arr_size; i++){

            Array[i] = sc.nextInt();            
        }
    System.out.println("the array values:");
     int max = Array[0];
        for(int i = 1 ; i<arr_size; i++){

            if(Array[i]>max){
                max = Array[i];

            }
            
        }
        System.out.println("the largest number is :"+max);
        
    
    }
}
