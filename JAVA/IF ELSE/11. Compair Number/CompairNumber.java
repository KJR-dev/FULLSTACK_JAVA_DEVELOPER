import java.util.*;

public class CompairNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 3 no.s");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a==b && a==c)
        System.out.println("input 3 number are same");
        else
        System.out.println("input 3 number are different");
        sc.close();
    }
}
