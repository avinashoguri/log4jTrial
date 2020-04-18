package beta;


import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;

public class Demo1 {
	
	private static Logger log=LogManager.getLogger(Demo1.class.getName());
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		log.debug("D1");
		log.error("d1");
		log.trace(" d1");
		log.info(" d1 ");
		System.out.println("done");
		

	}



}
