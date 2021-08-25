package com.app.log;

import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.xml.XMLLayout;

public class TestLog {
 private static Logger log=Logger.getLogger(TestLog.class);
	public static void main(String[] args) throws Exception {
		/*
		 * 1.create layout object
		 */
	    //	Layout layout=new SimpleLayout();
			Layout layout=new PatternLayout("%d,%C,%M,%m,%n");
			/*
			 * 2.create Appender Object +link layout
			 */
	  //	Appender app =new FileAppender(layout,"E:/log/c.log");
	    	Appender app =new ConsoleAppender(layout);
	    	/*
	    	 * 3. add Apperder object to Logger object
	    	 */
		    log.addAppender(app);
	   	
		
		log.debug("Debug Message");
		log.info("INFO Message");
		log.warn("Warn");
		log.error("Error");
		log.fatal("Fatal");
	}

}
