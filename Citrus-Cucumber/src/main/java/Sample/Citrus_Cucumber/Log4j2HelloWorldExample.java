package Sample.Citrus_Cucumber;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class Log4j2HelloWorldExample
{
    private static final Logger LOGGER = LogManager.getLogger(Log4j2HelloWorldExample.class.getName());
     
    public static void main(String[] args)
    {
        LOGGER.debug("Debug Message Logged !!");
        LOGGER.info("Info Message Logged !!");
        LOGGER.debug("Another Debug Message !!");
        System.out.println("sent loggers to the html file");
    }
}