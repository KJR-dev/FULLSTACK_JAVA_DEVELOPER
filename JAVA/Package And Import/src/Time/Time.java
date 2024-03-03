package Time;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Time {
    public static void getTime(){
        LocalDateTime date=LocalDateTime.now();
        DateTimeFormatter f=DateTimeFormatter.ofPattern("hh:mm:ss");
        System.out.println(f.format(date));
    }
}
