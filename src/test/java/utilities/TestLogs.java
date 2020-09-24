package utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import jdk.internal.org.jline.utils.Log;

public class TestLogs {
	
	public static Logger log = Logger.getLogger(TestLogs.class.getName());

	public static void main(String[] args) {
		
		PropertyConfigurator.configure("./src/test/resources/properties/log4j.properties");
		
		Log.info("This is the information log");
		
		Log.error("Here the error logs will be printed");

	}

}
