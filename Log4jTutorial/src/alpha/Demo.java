package alpha;

import org.apache.logging.log4j.*;

public class Demo {
	
	private static Logger log=LogManager.getLogger(Demo.class.getName());
	
	public static void main(String[] args) {
		
		log.debug("debug message");
		log.error("error message");
		log.trace("trace message");
		log.warn("warning message");
		
		//Example for using the methods- Scenario: ascript where i am testing a button 
		
		log.debug("I have clicked on button");
		log.info("Button is displayed");
		log.error("Button is not displayed");
		log.fatal("Button is missing");
		
		//https://logging.apache.org/log4j/2.x/manual/configuration.html the website to get xml format
	}

}
