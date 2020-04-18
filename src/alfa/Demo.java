package alfa;


import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;

public class Demo {
	
	private static Logger log=LogManager.getLogger(Demo.class.getName());
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		log.debug("debugging demo");
		log.error("error log demo");
		log.trace("log tracing demo ");
		log.info("log information demo");
		System.out.println("done");
		System.out.println("done test");
		
		

	}



}
