package com.bl.demopackgs;

public class Demo {
	public static void main(String[] args) {
		Overloading overloading = new Overloading();
		int result = overloading.add(19, 20);
		System.out.println(result);
		
		
		double result1 = overloading.add(12.4 , 12);
		System.out.println(result1);
		
		double result2 = overloading.add(12.4 , 12);
		System.out.println(result2);
		
		Child child = new Child();
		child.add(10, 20);
		//coasting
		int r = 10;
		float k = r;
		int s =(int) k;
		 
		Overloading k1 = child;
		Child t = (Child) k1;
		
		Factorial factorial = new Factorial();
		long result3 = factorial.getFactorial(5);
		System.out.println(result3);
	}
}
