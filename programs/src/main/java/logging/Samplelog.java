package logging;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Samplelog {
	
	final static Logger logger= Logger.getLogger(Samplelog.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Samplelog samplelog=new Samplelog();
		samplelog.runme("naidu");

		
	}
private void runme(String parameter) {
	
	if(logger.isDebugEnabled()) {
		
		logger.debug("this is debug :"+parameter);
	}
	
	if (logger.isInfoEnabled()) {
		logger.error("this is info :"+parameter);
		
	}
	logger.warn("This is warn : " + parameter);
	logger.error("This is error : " + parameter);
	logger.fatal("This is fatal : " + parameter);
	
}
}
