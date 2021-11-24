package com.bl.demopackgs;

public class Factorial {
	long getFactorial(int a) {
		int fact = 1;
		for( a = 2; a <= 5; a ++);{
			fact = fact  * a;
			
	}
		return fact;
		
		
	}
	long getFectorial2(int a) {
		long fact = 1;
		if (a > 1) {
			fact = getFectorial2(a - 1) * a;
	}
	return fact;
	}

	
}
