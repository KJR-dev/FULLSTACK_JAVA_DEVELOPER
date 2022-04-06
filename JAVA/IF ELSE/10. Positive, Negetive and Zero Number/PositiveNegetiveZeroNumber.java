import java.util.Scanner;

public class PositiveNegetiveZeroNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("Input number is positive");
        } else if (num < 0) {
            System.out.println("Input number is negetive number");
        } else
            System.out.println("Input Number is Zero");
        sc.close();
    }
}
