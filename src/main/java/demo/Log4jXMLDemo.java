package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jXMLDemo {

	private static Logger logger=LogManager.getLogger(Log4jXMLDemo.class);
	public static void main(String[] args) {
		
		System.out.println("\nHELLO World....\n");
		logger.info("This is information message");
		logger.error("This an error message");
		logger.warn("This is warning message");
		logger.fatal("This is fatal message");
		logger.trace("This is trace message");
		System.out.println("\n Completed");
		
		
	}

}
