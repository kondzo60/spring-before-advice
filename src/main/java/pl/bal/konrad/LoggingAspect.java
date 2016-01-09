package pl.bal.konrad;

import java.util.logging.Logger;

public class LoggingAspect {
	
	public void logExecution(){
		Logger.getLogger(this.getClass().getName()).info("Method logExecution() ");
	}

}
