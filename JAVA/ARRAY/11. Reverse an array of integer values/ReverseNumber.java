import java.util.Scanner;

// Write a Java program to reverse an array of integer values.
/**
 * ReverseNumber
 */
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number for size of array");
        int num=sc.nextInt();
        int[] arr=new int[num];
        System.out.println("Enter numbers");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("input array is :-");
        for (int i : arr) {
            System.out.print(i +" ");
        }
        System.out.println();
        for (int i = 0; i < arr.length/2; i++) {
            
            arr[i]=arr[i]+arr[arr.length-i-1];
            arr[arr.length-i-1]=arr[i]-arr[arr.length-i-1];
            arr[i]=arr[i]-arr[arr.length-i-1];
        }
        for (int i : arr) {
            System.out.print(i +" ");
        }
        sc.close();
    }
    
}