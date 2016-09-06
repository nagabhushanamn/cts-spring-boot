package com.cts.bean.scope;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public abstract class Human{

	// ApplicationContext applicationContext=null;

	public Human() {
		super();
		System.out.println("Human instance created...");
	}

	public void eat() {
		// Food food=applicationContext.getBean("food",Food.class); // Lookup
		Food food=getFood();
		System.out.println("eating......");
	}

	// public void setApplicationContext(ApplicationContext arg0) throws
	// BeansException {
	// this.applicationContext=arg0;
	// }
	
	public abstract Food getFood();

}
