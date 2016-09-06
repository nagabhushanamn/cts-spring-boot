package com.cts.spring;

import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BPP implements BeanPostProcessor {
	
	private static Logger logger=Logger.getLogger("TODO");

	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		logger.info(arg1 +" postProcess before init");
		return arg0;
	}
	
	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		logger.info(arg1 +" postProcess after init");
		return arg0;
	}
	
}
