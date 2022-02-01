import java.util.*;

public class SumAverage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,sum=0;
        double avg;
        for (int i = 0; i < 5; i++) {
            n=sc.nextInt();
            sum+=n;
        }
        avg=sum/5;
        System.out.println("Sum of 5 input number is " + sum + " and average is " + avg);
        sc.close();
    }
}
