package Sample.coreprograms;

public class Switch {

	public static void main(String[] args) {
		
		int daynumber=9;
		String nameoftheday;
		switch (daynumber) {
		case 1: nameoftheday="Sunday";
		        break;
		case 2: nameoftheday="Monday";
        break;  
		case 3: nameoftheday="Tuesday";
        break;
		case 4: nameoftheday="Wednesday";
		break;
		case 5: nameoftheday="Thursday";
		break;
		case 6: nameoftheday="Friday";
		break;
		case 7: nameoftheday="Saturday";
		break;
		default :nameoftheday="Invalid";
		break;
		
		}
		System.out.println(nameoftheday);

	}

}
