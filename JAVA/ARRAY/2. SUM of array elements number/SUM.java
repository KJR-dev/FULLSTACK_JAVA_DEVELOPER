//Write a Java program to sum values of an array. 
import java.util.*;
public class SUM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int sum = 0;
        int num = sc.nextInt();
        int[] arr = new int[num];
        System.out.println("enter a numbers");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println("sum is " + sum);
        sc.close();
    }
}
