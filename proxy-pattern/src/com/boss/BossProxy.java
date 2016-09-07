package com.boss;

import com.aspects.Logging;
import com.aspects.Security;

public class BossProxy implements IBoss {

	Logging logging = new Logging();
	Security security = new Security();

	Boss boss = new Boss();

	@Override
	public String getSomething() {

		logging.doLog();
		security.doSec();

		String result = boss.getSomething();

		logging.doLog();

		return result;

	}

}
