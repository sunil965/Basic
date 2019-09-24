package array;

import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class DateConvert {

	public static void main(String[] args) throws ParseException {
		String start_dt = "2011-01-01";
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd"); 
		Date date = formatter.parse(start_dt);
		System.out.println("date "+date);
		
		SimpleDateFormat newFormat = new SimpleDateFormat("MM-dd-yyyy");
		String finalString = newFormat.format(date);

		System.out.println("finalString "+finalString);
		
		System.out.println("Local date is "+LocalDate.now().toString());
	}

}
