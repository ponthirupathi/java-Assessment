package Array;

import java.util.Scanner;
public class Task_5 {
 
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
     int small = Array[0];
        for(int i = 1 ; i<arr_size; i++){

            if(Array[i]<small){
                small = Array[i];

            }
            
        }
        System.out.println("The smallest number  of array is :"+small);
        
    
    }
}



