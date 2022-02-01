import java.util.*;
public class Floyds_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no.of rows");
        int num=sc.nextInt();
        int i=1;
        for (int j = 1; j < num+1; j++) {
            for (int k = 1; k < j+1; k++) {
                System.out.print(i++ + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}