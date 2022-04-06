// Find Largest element in the 2D array 3x4 matrix.

import java.util.Scanner;

public class Largest_element_in_3x4_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr=new int[3][4];
        System.out.println("enter numbers for array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        int num=arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (num<arr[i][j]) {
                    num=arr[i][j];
                }
            }
        }
        System.out.println("Largest number is :- "+num);
        sc.close();
    }
}
