package date_time;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;

public class CurrentDate {
    public static void main(String[] args) {

        String pattern = "dd-MM-yyyy HH:mm:ss";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        System.out.println("Current Date: "+date);

        // Another Way

        Date dt=new Date();
        System.out.println(dt);
        DateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String currentDate= dateFormat.format(dt);
        System.out.println("Current Date: "+currentDate);



    }
}
