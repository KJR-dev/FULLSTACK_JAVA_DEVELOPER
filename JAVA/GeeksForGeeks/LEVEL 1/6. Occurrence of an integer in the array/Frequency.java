//Find the occurrence of an integer in the array.

import java.util.Scanner;

public class Frequency{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value for array size :-");
        int num=sc.nextInt();
        int[] arr=new int[num];
        System.out.println("enter array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter number for find the frequency");
        int temp=sc.nextInt();
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (temp==arr[i]) {
                count++;
            }
        }
        System.out.println("Frequency of "+temp+" is "+ count);
        sc.close();
    }
}