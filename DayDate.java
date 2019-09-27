import java.text.*;
import java.util.*;

class DayDate{
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat format = new SimpleDateFormat("E dd/MM/yyyy");
        while( cal.get(Calendar.DAY_OF_WEEK) != Calendar.MONDAY ){
            cal.add(Calendar.DATE, -1);
        }
        System.out.println( format.format( cal.getTime() ) );
        cal.add(Calendar.DATE, 6);
        System.out.println( format.format( cal.getTime() ) );
    }
}