package Time;

public class Time{
    private int hours,min,sec;
    public void setTime(int x,int y, int z){
        hours=x;
        min=y;
        sec=z;
    }
    public void showTime(){
        System.out.println(hours+"hours "+min+"min "+sec+"sec");
    }
}