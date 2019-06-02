package com.huaxai;

public class B {
	private B() {
		
	}
	
	private static B b;
	
	public static B getb() {
		if(b == null) {
			b = new B();
		}
		return b;
	}

}
