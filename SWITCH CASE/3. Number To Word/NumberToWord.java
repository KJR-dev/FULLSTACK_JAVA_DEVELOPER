import java.util.*;
import java.io.*;

class NumberToWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String s = String.valueOf(number);
        for (int n = 0; n < s.length(); n++) {
            switch (s.charAt(n)) {
                case '1':
                    System.out.print(" ONE ");
                    break;
                case '2':
                    System.out.print(" TWO ");
                    break;
                case '3':
                    System.out.print(" THREE ");
                    break;
                case '4':
                    System.out.print(" FOUR ");
                    break;
                case '5':
                    System.out.print(" FIVE ");
                    break;
                case '6':
                    System.out.print(" SIX ");
                    break;
                case '7':
                    System.out.print(" SEVEN ");
                    break;
                case '8':
                    System.out.print(" EIGHT ");
                    break;
                case '9':
                    System.out.print(" NINE ");
                    break;
                case '0':
                    System.out.print(" ZERO ");
                    break;
                default:
                    System.out.print("Please enter a Number");
                    sc.close();
            }
        }
    }
}
