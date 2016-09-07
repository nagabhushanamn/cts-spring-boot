package com.worker;

import com.boss.Boss;
import com.boss.BossProxy;

public class Worker {

	public void work() {
		
		BossProxy boss=new BossProxy();
		String something=boss.getSomething();
		System.out.println(something);

	}

}
