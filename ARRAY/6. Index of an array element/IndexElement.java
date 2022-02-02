//Write a Java program to find the index of an array element. 

import java.util.*;

public class IndexElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for array size");
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();
        System.out.println("enter a number for searching element");
        int num1 = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (num1 == arr[i]) {
                System.out.println("Index is " + i + " of element " + num1);
                break;
            }
        sc.close();
        }
    }

}
