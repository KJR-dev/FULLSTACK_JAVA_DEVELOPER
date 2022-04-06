//Find the minimum and maximum element in an array.

import java.util.Scanner;

public class Minimum_Maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size :- ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the array elements :-");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(min>arr[i])
                min=arr[i];
            else if(max<arr[i])
                max=arr[i];
        }
        System.out.println("Minimum value is "+ min + " Maximum value is "+ max);
        sc.close();
    }
}
