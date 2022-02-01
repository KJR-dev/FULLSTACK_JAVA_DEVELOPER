import java.net.SocketImpl;
import java.util.Scanner;

public class SumOfNthNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int sum = 0;
        System.out.println("1 to " + n + "th number are ");
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
            sum += i;
        }
        System.out.println("sum 1 to " + n + "th number is " + sum);
        sc.close();
    }
}
