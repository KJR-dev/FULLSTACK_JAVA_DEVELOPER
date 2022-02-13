//Matrix Multiplication.

import java.util.Scanner;

public class Matrix_Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr1=new int[3][3];
        int[][] arr2=new int[3][3];
        int[][] arr3=new int[3][3];
        System.out.println("enter 1st array elements");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter 2nd array elements");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                arr2[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                int sum=0;
                for (int k = 0; k < arr1.length; k++) {
                    sum=sum+arr1[i][k]*arr2[k][j];
                    arr3[i][j]=sum;
                }
            }
        }
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3.length; j++) {
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
