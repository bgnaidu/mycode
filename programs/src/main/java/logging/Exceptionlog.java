package logging;

import org.apache.log4j.Logger;

public class Exceptionlog {

	final static Logger LOGGER=Logger.getLogger(Exceptionlog.class);
	 public void divide() {
		 int i=10/0;
	 }
	 public static void main(String[] args) {
		 Exceptionlog exceptionlog=new Exceptionlog();
		
		 
		 try {
			 exceptionlog.divide();
		} catch (ArithmeticException e) {
			LOGGER.error("this is wrong"+ e.getMessage());
			try {
				throw new Exception("ArithmeticException happend"+e.getMessage());
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
}
