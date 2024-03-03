package N_Natural_Number;

import java.util.Scanner;

public class N_Natural_Number {
    public void nNaturalNumber(){
        PrintNNaturalNumber obj=new PrintNNaturalNumber();
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        obj.getNaturalNumber(num);
    }

}
class PrintNNaturalNumber{
    public void getNaturalNumber(int num){
        for (int i = 1; i <= num; i++) {
            System.out.print(i + " ");
        }
    }
}

