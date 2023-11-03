package com.excellence_log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test {

	public static final Logger log = LogManager.getLogger(Test.class);

	public static void main(String[] args) {
		processData();
	}

	public static void processData() {
		log.trace("FROM TRACE METHOD");
		log.debug("FROM DEBUG METHOD");
		log.info("FROM INFO METHOD");
		log.warn("FROM WARN METHOD");
		log.error("FROM ERROR METHOD");
		log.fatal("FROM FATAL METHOD");
		// .. read inputs
		// .. validate them
		// .. store in db
		// .. return results
	}

}
