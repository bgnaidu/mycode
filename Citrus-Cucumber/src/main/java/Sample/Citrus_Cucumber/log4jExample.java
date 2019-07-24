package Sample.Citrus_Cucumber;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

import org.apache.commons.logging.impl.SimpleLog;

import org.slf4j.LoggerFactory;

public class log4jExample{
	private static final SimpleLog instance = new SimpleLog(null);
	   /* Get actual class name to be printed on */
	   static org.slf4j.Logger log = LoggerFactory.getLogger(log4jExample.class.getName());
	   
	   public static void main(String[] args)throws IOException,SQLException{
	      log.debug("Hello this is an debug message");
	      log.info("Hello this is an info message");
	      log.error("Hello this is an error message");
	      System.out.println("check the logger html file");
	      
	   }
} 