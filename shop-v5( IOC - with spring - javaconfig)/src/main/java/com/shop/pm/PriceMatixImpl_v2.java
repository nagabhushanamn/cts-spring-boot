package com.shop.pm;

import org.springframework.stereotype.Component;

public class PriceMatixImpl_v2 implements PriceMatrix{

	public double getPrice(String item) {
		// lookup on DB or WS call
		return 200.00;
	}

}
