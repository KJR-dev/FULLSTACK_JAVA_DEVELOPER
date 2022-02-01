/**
 Right_angle_triangle
              @
             @@
            @@@
           @@@@
          @@@@@
         @@@@@@
 */
import java.util.*;

public class Right_angle_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows no.s");
        int num = sc.nextInt();
        for (int i = 0; i <= num ; i++) {
            for (int j = 0; j <= num; j++) {
                if (j<= num-i) 
                    System.out.print(" ");
                else
                    System.out.print("@");
            }
            System.out.println();
        }
        sc.close();
    }

}