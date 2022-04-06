//Write a program to reverse the array.

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number size of array :-");
        int num=sc.nextInt();
        int[] arr=new int[num];
        System.out.println("enter array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("reverse array is :-");
        int temp;
        for (int i = 0; i < (arr.length/2); i++) {
            
            temp=arr[i];
            arr[i]=arr[(arr.length-1-i)];
            arr[(arr.length-1-i)]=temp;
            
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
