package exceptionhandling;

public class Testcustomexcep {

	public static void main(String[] args)  {

		//throw new UncheckedCustom_Exceptions("bussines event not found exception");
		try {
			throw new Checke_Custom_exception("Bussines identifeir is missing");
		} catch (Checke_Custom_exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
