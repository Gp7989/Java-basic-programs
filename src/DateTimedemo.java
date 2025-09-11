import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimedemo {
    public static void main(String[] args) {
       // LocalDate obj = LocalDate.now();
       // System.out.println(obj);
        //LocalTime obj2 = LocalTime.now();
       // System.out.println(obj2);
        LocalDateTime obj3 = LocalDateTime.now();
        System.out.println("before format"+obj3);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-mm-yy  hh:mm:ss:ms");
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM-dd-yy  ss:mm:HH:ms");
        String result = format.format(obj3);
        System.out.println(result);

    }
}
