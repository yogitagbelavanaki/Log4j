package beta;

import org.apache.logging.log4j.*;


public class Sample {
	public static Logger log=LogManager.getLogger(Sample.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log.warn("Warning message from beta package");
		log.error("error message from beta package");
		log.trace("tracing message from beta package");
		log.debug("Debug message from beta package");

	}

}
