package org.kishor.javabrains;

public class Tea implements IHotDrink {
	@Override
	public void prepareHotDrink() {	
      System.out.println("We are preparing a Tea for you...!");
	}
	
	public void init() {
		System.out.println("Tea Bean is initializing");
	}

	public void destroy() {
		System.out.println("Tea Bean will destroy now");
	}
}
