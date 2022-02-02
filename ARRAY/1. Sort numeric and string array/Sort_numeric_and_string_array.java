//Write a Java program to sort a numeric array and a string array.

import java.util.*;

public class Sort_numeric_and_string_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner("System.in");
        System.out.println("Enter a no.");
        int num=sc.nextInt();
        int[] arr1=new int[num];
        String[] arr2=new String[num];
        System.out.println("enter numbers");
        for (int i = 0; i < num; i++) {
            arr1[i]=sc.nextInt(); 
        }
        for (int i = 0; i < num; i++) {
            arr2[i]=sc.nextLine(); 
        }
        sc.close();
    }
}
