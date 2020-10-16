import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by Axel Jeansson
 * Date: 2020-10-13
 * Time: 13:37
 * Project: Inlämning2
 * Copyright: MIT
 */
public class Membership {

    private LocalTime t = LocalTime.now();
    private LocalDate d = LocalDate.now();
    private LocalDate yearAgo = d.minusYears(1);

    public String getTime(){
        return t.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }

    public LocalDate getDate(){
        return d;
    }

    public boolean MembershipDate(LocalDate date){
        if (date.isAfter(yearAgo))
            return true;
        else
            return false;
    }




}
