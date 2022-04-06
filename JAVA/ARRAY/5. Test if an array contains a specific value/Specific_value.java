//Write a Java program to test if an array contains a specific value.

import java.util.*;

public class Specific_value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int index = 0; index < arr.length; index++) {
            arr[index] = sc.nextInt();
        }
        System.out.println("enter a number for specific value");
        int n=sc.nextInt();
        for (int i : arr)
            if (i==n)
                System.out.println("TRUE");
        sc.close();
    }
}
