package Date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date {
    public static void getDate() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(f.format(now));
    }
}
