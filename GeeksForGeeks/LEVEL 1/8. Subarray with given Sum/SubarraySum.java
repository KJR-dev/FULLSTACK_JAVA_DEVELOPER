import java.util.Scanner;

public class SubarraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number for array size");
        int num=sc.nextInt();
        int[] arr=new int[num];
        System.out.println("enter array elements :-");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        
    }
    
}
