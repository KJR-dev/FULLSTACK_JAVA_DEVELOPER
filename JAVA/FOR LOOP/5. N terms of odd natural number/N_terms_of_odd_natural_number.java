import java.util.*;
public class N_terms_of_odd_natural_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        for (int i = 1; i < num*2; i++) 
            if (i%2==1) 
                System.out.println(i);
        sc.close();     
    }
}
