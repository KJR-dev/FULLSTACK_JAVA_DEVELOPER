// Define a class Time to represent Time (like 3 hr 45 min 20 sec). Declare appropriate number of instance member
// variables and also define instance member functions to set values for time and display values of time.

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