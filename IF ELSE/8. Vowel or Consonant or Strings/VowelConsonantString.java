import java.util.*;
public class VowelConsonantString {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       char c=sc.next().charAt(0);
       System.out.println(c);
       if(c)
       {
            if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U' || c=='a' || c=='e' || c=='i' || c=='o' || 'u')
                System.out.println("User input character is Vowel");
            else
                System.out.println("User input character is consonant");
       }
       else
       System.out.println("please input a character");
    }
}
