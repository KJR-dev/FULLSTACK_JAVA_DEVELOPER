import java.util.*;
public class Print_inverted_right_angle_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no. for rows");
        int num=sc.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (j>=i) 
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
