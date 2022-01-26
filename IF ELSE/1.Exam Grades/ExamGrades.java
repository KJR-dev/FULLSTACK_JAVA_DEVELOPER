import java.util.*;
class ExamGrades{
    public static void main(String[] args) {
        int sub1,sub2,sub3,sum=0,avg;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers");
        sub1=sc.nextInt();
        sub2=sc.nextInt();
        sub3=sc.nextInt();
        sum=sub1+sub2+sub3;
        avg=sum/3;
        if(avg >= 70)
        System.out.println("Smily face");
        else
            System.out.println(avg); 
    }
}
