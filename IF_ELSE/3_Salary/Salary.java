import java.util.*;
class Salary{
    public static void main(String[] args) {
        double profit,Sales;
        Scanner sc = new Scanner(System.in);
        Sales=sc.nextDouble();
        if(Sales>=50000)
            profit=(575+(Sales/100)*16);
        else if(Sales >= 40000 && Sales < 50000)
            profit=(550+(Sales/100)*14);
        else if(Sales >= 30000 && Sales < 40000)
            profit=(525+(Sales/100)*12);
        else if(Sales >= 20000 && Sales < 30000)
            profit=(500+(Sales/100)*9);
        else if(Sales >= 10000 && Sales < 20000)
            profit=(450+(Sales/100)*5);
        else
            profit=(400+(Sales/100)*3);
        System.out.println(profit);
    }
}