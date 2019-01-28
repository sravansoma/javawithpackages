import java.time.*;
import java.util.stream.Stream;

public class DateTimeTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDate date1 = LocalDate.of(1989, Month.APRIL, 20);

        LocalTime time= LocalTime.now();

        Instant i = Instant.now();

//        for (String s : ZoneId.getAvailableZoneIds()) {
//            System.out.println(s);
//        }
        LocalTime time1 = LocalTime.now(ZoneId.of("Iran"));

        System.out.println(date);
        System.out.println(date1);
        System.out.println(time);
        System.out.println(time1);
        System.out.println(i);
    }
}
