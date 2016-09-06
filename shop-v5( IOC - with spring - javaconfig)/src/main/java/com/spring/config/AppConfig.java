package com.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.shop.bill.Billing;
import com.shop.bill.BillingImpl;
import com.shop.pm.PriceMatixImpl_v1;
import com.shop.pm.PriceMatrix;


@Configuration
public class AppConfig {

	@Bean(name="pmV1")
	public PriceMatrix getPriceMatrix() {
		PriceMatrix priceMatrix = null;
		priceMatrix = new PriceMatixImpl_v1();
		return priceMatrix;
	}

	@Bean(name="billComp1")
	public Billing getBilling() {
		BillingImpl billing = new BillingImpl();
		billing.setPriceMatrix(getPriceMatrix());
		return billing;
	}

}
