
/**Write a Java program to print the following grid. Go to the editor
Expected Output :

- - - - - - - - - 
- - - - - - - - - 
- - - - - - - - - 
- - - - - - - - - 
- - - - - - - - - 
- - - - - - - - - 
- - - - - - - - - 
- - - - - - - - -                 
- - - - - - - - - 
- - - - - - - - - -  */

import java.util.*;

public class Grid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print("-");
            }
            System.out.println();
        }
        sc.close();
    }

}
