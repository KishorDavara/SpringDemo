package org.kishor.javabrains;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Coffee implements IHotDrink, InitializingBean,DisposableBean {

	@Override
	public void prepareHotDrink() {
		System.out.println("We are preparing a Coffee for you...!");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
      System.out.println("Coffee Bean is going through afterPropertiesSet");
	}
	
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Coffee Bean is destroying now.");
	}


}
