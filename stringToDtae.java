import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;
import java.io.*;

public class stringToDate
{
    private Calendar cal = Calendar.getInstance();

    public stringToDate(Calendar aCal)
    {
        this.cal = aCal;
    }

    public void addDate() {
        return cal.add(Calendar.DATE, 1);
    }

    Date date = cal.getTime(); // get datetime now

    SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");

    String date1 = format1.format(date);

    Date inActiveDate = null;
    /*
    try
    {
        inActiveDate = format1.parse(date1);
    } catch (ParseException e1)
      {

    // TODO Auto-generated catch block

    e1.printStackTrace();

       }
    */

    //public class StringToDateExample1 {
        public static void main(String[] args)throws Exception {
            String sDate1 = "31/12/1998";
            Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
            System.out.println(sDate1 + "\t" + date1);
        }
}
