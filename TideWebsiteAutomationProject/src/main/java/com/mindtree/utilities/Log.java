package com.mindtree.utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log {
	// private static Logger log = LogManager.getLogger(Log.class.getName());
	static Logger log = Logger.getLogger(Log.class);

	public void configureLog() {
		PropertyConfigurator.configure(
				"C:\\Users\\Spoorthy\\eclipse-workspace\\ecomproject\\src\\main\\resources\\log4j.properties");
	}

	public void infoLog(String text) {
		log.info(text);
	}

	public void fatalLog(String text) {
		log.fatal(text);
	}

	public void errorLog(String text) {
		log.error(text);
	}

	public void traceLog(String text) {
		log.trace(text);
	}
}
