package date_time;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class DateDemo2 {
    public static void main(String[] args) {

        GregorianCalendar gc = new GregorianCalendar ();
       // System.out.println ( gc.get(Calendar.DATE));

//
//        TimeZone tz = gc.getTimeZone ();
//        System.out.println (tz.getID ());


        gc.setTimeZone ( (TimeZone.getTimeZone ( "America/Los_Angeles" )) );
        TimeZone tz = gc.getTimeZone ();
        System.out.println (tz.getID ());

    }
}
