package com.shop;

import java.util.Arrays;
import java.util.List;

import com.shop.bill.Billing;
import com.shop.bill.BillingImpl;
import com.shop.pm.PriceMatixImpl_v1;
import com.shop.pm.PriceMatixImpl_v2;
import com.shop.pm.PriceMatrix;

public class App {

	public static void main(String[] args) {

		// Init - phase   
		
		// 'some-one'  --> component-manager / container / ApplicationContext -  based on configuration should instantiate and assemble comps
		
		PriceMatrix priceMatrix_v1=new PriceMatixImpl_v1();
		PriceMatrix priceMatrix_v2=new PriceMatixImpl_v2();
		
		Billing billComp = new BillingImpl(priceMatrix_v2);

		// Use - phase

		List<String> cart = Arrays.asList("123123", "1231356");
		double totalPrice = billComp.getTotalPrice(cart);

		System.out.println("total price :" + totalPrice);

		// Destroy -phase
		billComp = null;

	}

}
