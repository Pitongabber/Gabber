import java.sql.SQLOutput;
import java.util.Date;
import java.text.SimpleDateFormat;


public class Zadanie2
{
    public static void main (String [] args){
        Date currentDate = new Date();
        SimpleDateFormat dayFormat = new SimpleDateFormat("EEEEEEEE");
        String day = dayFormat.format(currentDate);
        System.out.println(day);
        SimpleDateFormat mounthFormat = new SimpleDateFormat("MMMMMM");
        String mounth = mounthFormat.format(currentDate);
        System.out.println(mounth);
        System.out.println("Евгений");
    }
}
