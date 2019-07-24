package dateFormat;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateformatDemo {

	public static void main(String[] args) {
		Date d=new Date();
		DateFormat usdf=DateFormat.getDateInstance(0, Locale.US);
		DateFormat ukdf=DateFormat.getDateInstance(0, Locale.UK);
		System.out.println(usdf.format(d));
		System.out.println(ukdf.format(d));
		
		DateFormat timeInstance = DateFormat.getTimeInstance();
		
		System.out.println(timeInstance.format(d));
		
		DateFormat dateTimeInstance = DateFormat.getDateTimeInstance(0, 0);
		System.out.println(dateTimeInstance.format(d));
	}

}
