import java.util.Scanner;

public class Transpose_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr1=new int[3][3];
        int[][] arr2=new int[3][3];
        System.out.println("enter arrary elements");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                arr1[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                arr2[i][j]=arr1[j][i];
            }
        }
        System.out.println("after transpose array :-");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
