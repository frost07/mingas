package xml;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GetTimeForXML {

    public static String dateNow(){
        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("ddMMyyyy");
        return formatForDateNow.format(dateNow);

    }
}
