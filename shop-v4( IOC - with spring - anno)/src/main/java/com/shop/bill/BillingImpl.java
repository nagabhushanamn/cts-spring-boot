package com.shop.bill;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.shop.pm.PriceMatrix;

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
 *          types
 *          
 *           --> constructor
 *           --> settter
 *           
 *           --> field ( with annotation & reflection API )
 *           --> method
 *          
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

@Component("billComp1")
public class BillingImpl implements Billing {

	private PriceMatrix priceMatrix = null;

	
	//	public BillingImpl(PriceMatrix priceMatrix) {
	//		this.priceMatrix = priceMatrix;
	//	}

	
	@Autowired
	@Qualifier(value="pmV2")
	public void setPriceMatrix(PriceMatrix priceMatrix) {
		this.priceMatrix = priceMatrix;
	}
	
	public double getTotalPrice(List<String> cart) {

		double total = 0.0;

		for (String item : cart) {
			total += priceMatrix.getPrice(item);
		}

		return total;

	}

}
