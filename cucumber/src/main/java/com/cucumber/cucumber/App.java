package com.cucumber.cucumber;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App 
{
public static void main(String[] args) {
	
	App app=new App();
	app.setTemperature(38);
}

		   final static Logger logger = LoggerFactory.getLogger(App.class);
		   Integer t;
		   Integer oldT;

		   public void setTemperature(Integer temperature) {
		     oldT = t;
		     t = temperature;
		     logger.debug("Temperature set to {}. Old temperature was {}.", t, oldT);
		     if(temperature.intValue() > 50) {
		       logger.info("Temperature has risen above 50 degrees.");
		     }
		   }

}
