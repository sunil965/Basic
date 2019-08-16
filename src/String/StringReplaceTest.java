package String;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

public class StringReplaceTest {

	public static void main(String[] args) {
//		String s1 = "a;    b;c; d  ;";
		/*String s1 = "Test String 1234 Concat "; 
		System.out.println("s1 is : "+s1);

		System.out.println("s2 via method call is : "+removeWhiteSpace(null, s1));*/
		/*LocalDate date = LocalDate.now();
		System.out.println("LocalDate " +date);
		
		Date now = new Date();
		System.out.println("Date " +now);

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ");

		simpleDateFormat.setTimeZone(TimeZone.getTimeZone("Europe/London"));
		System.out.println(simpleDateFormat.format(now));

		simpleDateFormat.setTimeZone(TimeZone.getTimeZone("Europe/Paris"));
		System.out.println(simpleDateFormat.format(now));
		
		DateTimeFormatter formatter = DateTimeFormatter.BASIC_ISO_DATE;
		String formattedDate = formatter.format(LocalDate.now());
		System.out.println("DateTimeFormatter "+ formatter);
		
		ZonedDateTime dateTime = ZonedDateTime.now();
		System.out.println("ZonedDateTime "+ dateTime);*/
		
		String splitStr = "12:00 PM";
		System.out.println("Actual : "+splitStr);
		String[] arr = splitStr.split(":");
		for (String string : arr) {
			System.out.print(" After split : ");
			System.out.println(string.substring(0, 2));
		}
	}
	public static Object removeWhiteSpace(List<String> list, String str) {
		
		String s2 = str.trim().replaceAll(" ", "-").toLowerCase()/*.replaceAll(";", ",")*/;
		System.out.println("s2 is : "+s2);
		
		if (s2.endsWith(",")) {
			s2=s2.substring(0, s2.length()-1);
		}
		
		return s2;
	}

}
