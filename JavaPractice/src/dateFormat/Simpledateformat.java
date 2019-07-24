package dateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Simpledateformat {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat simpledate=new SimpleDateFormat("dd/m/yyyy h:mm:ss");
		String format = simpledate.format(new Date());
		System.out.println(format);
		
		String date="1-31-2019";
		
		SimpleDateFormat dateFormat=new SimpleDateFormat("mm-dd-yyyy");
		Date parse = dateFormat.parse(date);
		System.out.println(parse);

	}

}
