package function;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Utils {

   public static String date(String date) {
       String[] dateSplit = date.split("/");
       String dateFormat = dateSplit[2] + "-" + dateSplit[1] + "-" + dateSplit[0];
       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
       return LocalDate.parse(dateFormat).format(formatter);
   }

   public static double amountOf(double amount) {
       if(amount < 0) {
           return 0;
       }
       return amount;
   }

}
