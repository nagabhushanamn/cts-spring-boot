package com.shop;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shop.bill.Billing;
import com.shop.bill.BillingImpl;
import com.shop.pm.PriceMatixImpl_v1;
import com.shop.pm.PriceMatixImpl_v2;
import com.shop.pm.PriceMatrix;

public class App {

	public static void main(String[] args) {

		// Init - phase   
		
		ConfigurableApplicationContext applicationContext=null;  // spring-container
		applicationContext=new ClassPathXmlApplicationContext("application-context.xml");
		
		System.out.println("-----------------------------------------------------------");
		

		// Use - phase
		Billing billComp=applicationContext.getBean("billComp1",Billing.class);
		List<String> cart = Arrays.asList("123123", "1231356");
		double totalPrice = billComp.getTotalPrice(cart);
		
		System.out.println("total price :" + totalPrice);
		
		System.out.println("-----------------------------------------------------------");

		// Destroy -phase
		applicationContext.close();
	

	}

}
