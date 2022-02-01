import java.util.*;

public class Right_angle_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row number");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) 
                System.out.print(j);
            System.out.println();
        }
        sc.close();
    }
}
