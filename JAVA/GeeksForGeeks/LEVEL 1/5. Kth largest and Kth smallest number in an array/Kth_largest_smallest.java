//Find the Kth largest and Kth smallest number in an array.

import java.util.Scanner;

public class Kth_largest_smallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size :-");
        int num=sc.nextInt();
        int[] arr=new int[num];
        System.out.println("enter array elements :-");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]>arr[j]) {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("enter number for find out Kth smallest element number :-");
        temp=sc.nextInt();
        System.out.println(temp+"th smallest element in the given array is "+ arr[temp-1]);
        sc.close();
    }
    
}
