package pl.bal.konrad;

import org.apache.log4j.Logger;

public class LoggingAspect {
	private Logger logger = Logger.getLogger(this.getClass().getName());
	
	public void logExecution(){
		logger.info("Method logExecution() ");
	}
	
	public void warnIfNull(Object returnedValue){
		if(returnedValue == null)
			logger.warn("Zwracana wartosc jest nullem");
		
	}

}
