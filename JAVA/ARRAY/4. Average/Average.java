
//Write a Java program to calculate the average value of array elements. 

import java.util.*;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no. for size of array");
        int num = sc.nextInt();
        int sum = 0;
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println("Average of array is " + (double) sum / num);
        sc.close();
    }
}
