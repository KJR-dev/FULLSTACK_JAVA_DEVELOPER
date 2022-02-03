//Write a Java program to find the common elements between two arrays of integers.

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of 1st array");
        int num1=sc.nextInt();
        System.out.println("enter numbers :-");
        int[] arr1=new int[num1];
        for (int i = 0; i < arr1.length; i++)
            arr1[i]=sc.nextInt();
        System.out.println("1st array is");
        for (int i : arr1)
            System.out.print(i+" ");
        System.out.println("\nenter size of 2nd array");
        int num2=sc.nextInt();
        System.out.println("enter numbers :-");
        int[] arr2=new int[num2];
        for (int i = 0; i < arr2.length; i++)
            arr2[i]=sc.nextInt();
        System.out.println("2st array is");
        for (int i : arr2)
            System.out.print(i+" ");
            System.out.println("\ncommon elements are:- ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i]==arr2[j])
                    System.out.print(arr1[i]+" ");
            }
        }
        sc.close();
    }
}
