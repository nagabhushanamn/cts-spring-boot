package com.shop.bill;

import java.util.List;

import com.shop.pm.PriceMatixImpl_v1;

/*
 * 
 * OO principle
 * 
 *  " closed for modification , open for Extension "
 *  
 *  ------------------------------------------------------------
 * 
 *  design & performance issues
 *  ---------------------------
 *  
 *  a. tight-coupling  ( maintenance  issues )
 *  
 *  b. too many same dependencies created/destructed  ( memory use high / slow )
 *  
 *  c. Unit-Testing not possible ( can't ensure comp func  , dev slow )
 *  
 * 
 * 
 *  why these issues occurring here ?
 *  
 *  creating dependency-obj in dependent's class
 *  
 *  
 *  soln :
 *  
 *  don't create dependency in dependent's class , do 'look-up'
 *  
 *  
 *  Limitation on Loop-up :
 *  
 *  location tight-coupling
 *  
 *  best soln :
 *  
 *  don't create & dont lookup , get/inject by 'some-one'  ( Inversion Of Control )
 *  
 *  
 *  how to implement IOC ?
 *  
 *  way-1 : 'dependency injection ' ( DI )  
 *  
 *  way-2 : AOP  ( via proxy )
 *  
 *  -------------------------------------------------------------------------
 *  
 *  
 *  
 *  
 * 
 */

public class BillingImpl {

	private PriceMatixImpl_v1 priceMatix = null;

	public double getTotalPrice(List<String> cart) {

		double total = 0.0;

		priceMatix = new PriceMatixImpl_v1();

		for (String item : cart) {
			total += priceMatix.getPrice(item);
		}

		return total;

	}

}
