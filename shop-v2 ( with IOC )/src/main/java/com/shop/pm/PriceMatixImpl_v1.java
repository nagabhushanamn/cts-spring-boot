package com.shop.pm;

public class PriceMatixImpl_v1 implements PriceMatrix {

	/* (non-Javadoc)
	 * @see com.shop.pm.PriceMatrix#getPrice(java.lang.String)
	 */
	public double getPrice(String item) {
		// lookup on DB or WS call
		return 100.00;
	}

}
