package date_time;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class Date_Time_Formatter {
    public static void main(String[] args) {


        ZonedDateTime dt = ZonedDateTime.now ();
        DateTimeFormatter df = DateTimeFormatter.ofPattern ( "dd/MM/yyyy  HH:mm:ss z Z " );

        System.out.println (df.format ( dt));

//        LocalDateTime dt = LocalDateTime.now ();
//        System.out.println (dt.get ( ChronoField.YEAR ));


    }
}
