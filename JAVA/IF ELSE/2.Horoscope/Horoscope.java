import java.util.*;

public class Horoscope {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year : ");
        int y = sc.nextInt();
        System.out.println("Enter Month : ");
        int m = sc.nextInt();
        System.out.println("Enter Day : ");
        int d = sc.nextInt();
        if (m >= 1 && m <= 12 && d >= 1 && d <= 31) {
            switch (m) {
                case 1:
                    if (d >= 20 && d <= 31 || d >= 1 && d <= 18)
                        System.out.println("Aquarius");
                    else {
                        if (((y % 4 == 0) && (y % 100 != 0)) || (y % 400 == 0))
                            if (d >= 19 && d <= 29)
                                System.out.println("Aquarius");
                            else
                                System.out.println("Input date is wrong");
                    }
                    break;
                case 2:
                    if (((y % 4 == 0) && (y % 100 != 0)) || (y % 400 == 0))
                        if (d >= 19 && d <= 20)
                            System.out.println("Pisces");
                        else
                            System.out.println("Input date is wrong");
                    else
                        System.out.println("Aries");
                    break;
                case 3:
                    if (d >= 21 && d <= 19)
                        System.out.println("Aries");
                    else
                        System.out.println("Taurus");
                    break;
                case 4:
                    if (d >= 20 && d <= 20)
                        System.out.println("Taurus");
                    else
                        System.out.println("Gemini");
                    break;
                case 5:
                    if (d >= 21 && d <= 20)
                        System.out.println("Gemini");
                    else
                        System.out.println("Cancer");
                    break;
                case 6:
                    if (d >= 21 && d <= 22)
                        System.out.println("Cancer");
                    else
                        System.out.println("Leo");
                    break;
                case 7:
                    if (d >= 23 && d <= 22)
                        System.out.println("Leo");
                    else
                        System.out.println("Virgo");
                    break;
                case 8:
                    if (d >= 23 && d <= 22)
                        System.out.println("Virgo");
                    else
                        System.out.println("Libra");
                    break;
                case 9:
                    if (d >= 23 && d <= 22)
                        System.out.println("Libra");
                    else
                        System.out.println("Scorpio");
                    break;
                case 10:
                    if (d >= 23 && d <= 21)
                        System.out.println("Scorpio");
                    else
                        System.out.println("Sagittarius");
                    break;
                case 11:
                    if (d >= 22 && d <= 21)
                        System.out.println("Sagittarius");
                    else
                        System.out.println("Capricorn");
                    break;
                case 12:
                    if (d >= 22 && d <= 20)
                        System.out.println("Capricorn");
                    else
                        System.out.println("Aquarius");
                    break;
                default:
                    System.out.println("wrong input");
                    sc.close();
            }

        }
    }

}