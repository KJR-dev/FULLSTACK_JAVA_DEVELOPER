import java.util.*;

public class QuadraticEquations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a");
        double a = sc.nextDouble();
        System.out.println("Enter value of b");
        double b = sc.nextDouble();
        System.out.println("Enter value of c");
        double c = sc.nextDouble();
        double res;
        double res1;
        double res2;
        res = (b * b) - (4.0 * a * c);
        if (res > 0.0) {
            res1 = (-b + Math.pow(res, 0.5)) / (2.0 * a);
            res2 = (-b - Math.pow(res, 0.5)) / (2.0 * a);
            System.out.println("The roots are " + res1 + " and " + res2);
        } else if (res == 0.0) {
            res1 = -b / (2.0 * a);
            System.out.println("The root is " + res1);
        } else
            System.out.println("The equation has no real roots.");
        sc.close();
    }
}
