import java.util.*;
class Arithmetic{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        char c=sc.next().charAt(0);
        switch(c)
        {
            case '+':
                System.out.println(n1+n2);
                break;
            case '-':
                System.out.println(n1-n2);
                break;
            case '*':
                System.out.println(n1*n2);
                break; 
            case '/':
                System.out.println(n1/n2);
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}