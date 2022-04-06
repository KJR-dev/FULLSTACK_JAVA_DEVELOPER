import java.util.*;

public class Cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int i, cube;
        for (int j = 1; j <= n; j++) {
            cube = 1;
            i = 3;
            while (i-- > 0)
                cube *= j;
            System.out.println("cube of " + j + " is " + cube);
        }
        sc.close();
    }
}
