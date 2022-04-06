import java.util.*;

class Arithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int r;
        char c = sc.next().charAt(0);
        switch (c) {
            case '+':
                r = n1 + n2;
                System.out.println(r);
                break;
            case '-':
                r = n1 - n2;
                System.out.println(r);
                break;
            case '*':
                r = n1 * n2;
                System.out.println(r);
                break;
            case '/':
                r = n1 / n2;
                System.out.println(r);
                break;
            case '%':
                r = n1 % n2;
                System.out.println(r);
                break;
            default:
                System.out.println("Invalid input");
            sc.close();
        }
    }
}