
// Write a Java program to copy an array by iterating the array.
import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number for size of array");
        int num = sc.nextInt();
        int[] arr = new int[num];
        int[] arr1 = new int[num];
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();
        for (int i = 0; i < arr1.length; i++)
            arr1[i] = arr[i];
        for (int i = 0; i < arr1.length; i++)
            System.out.println("arr = " + arr[i] + " , arr1=" + arr1[i]);
        sc.close();
    }
}
