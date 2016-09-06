package com.shop;

import java.util.Arrays;
import java.util.List;

import com.shop.bill.BillingImpl;

public class App {

	public static void main(String[] args) {

		// Init - phase
		BillingImpl billComp = new BillingImpl();

		// Use - phase

		List<String> cart = Arrays.asList("123123", "1231356");
		double totalPrice = billComp.getTotalPrice(cart);

		System.out.println("total price :" + totalPrice);

		// Destroy -phase
		billComp = null;

	}

}
