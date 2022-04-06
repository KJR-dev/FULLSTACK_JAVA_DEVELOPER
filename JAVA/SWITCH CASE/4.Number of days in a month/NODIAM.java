import java.util.*;

public class NODIAM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a month in number");
        int m = sc.nextInt();
        System.out.println("Enter a year");
        int y = sc.nextInt();

        switch (m) {
            case 1:
                System.out.println("January " + y + " has 31 days");
                break;
            case 2:
                if ((y % 4 == 0) && ((y % 400 == 0) || (y % 100 != 0)))
                    System.out.println("Febuary " + y + " has 29 days");
                else
                    System.out.println("Febuary " + y + " has 28 days");
                break;
            case 3:
                System.out.println("March " + y + " has 31 days");
                break;
            case 4:
                System.out.println("April " + y + " has 30 days");
                break;
            case 5:
                System.out.println("May " + y + " has 31 days");
                break;
            case 6:
                System.out.println("June " + y + " has 30 days");
                break;
            case 7:
                System.out.println("July " + y + " has 31 days");
                break;
            case 8:
                System.out.println("August " + y + " has 31 days");
                break;
            case 9:
                System.out.println("September " + y + " has 30 days");
                break;
            case 10:
                System.out.println("October " + y + " has 31 days");
                break;
            case 11:
                System.out.println("November " + y + " has 30 days");
                break;
            case 12:
                System.out.println("December " + y + " has 31 days");
                break;
            default:
                System.out.println("Please enter valid number 1 to 12.");
                break;
        }

        sc.close();
    }
}
