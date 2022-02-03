//Write a Java program to find the duplicate values of an array of integer values.
/**
 * DuplicateValue
 */
import java.util.*;
public class DuplicateValue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number for array size");
        int num=sc.nextInt();
        int[] arr=new int[num];
        System.out.println("enter numbers:- ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Duplicate value are:-");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j])
                    System.out.print(arr[j]+"   ");
            }
        }
        sc.close();
    }
}