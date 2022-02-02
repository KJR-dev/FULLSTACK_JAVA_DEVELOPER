import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number for size of array");
        int num=sc.nextInt();
        int[] arr=new int[num];
        for (int i = 0; i < arr.length; i++) 
            arr[i]=sc.nextInt();
        int MAX=arr[0];
        int MIN=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(MAX<arr[i])
            MAX=arr[i];
            if(MIN>arr[i])
            MIN=arr[i];
        }
        System.out.println("MAXIMUM value is "+ MAX +" MINIMUM value is "+MIN);
        sc.close();
    }
}
