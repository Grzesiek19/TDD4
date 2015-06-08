package com.TDD.example;

public class Fibonacci {

	
	/**
	 * Gives a value of a Fibonacci sequence for given term.
	 * 
	 * @param term, the term for which will be calculated Fibonacci value.
	 * 
	 * @return suitable value for given term.
	 */
	
	public int getFiboValue(int term) {
		int fibonacci = 0;
		if (term == 0)
			return 0;
		else if (term == 1)
			return 1;
		else {
			int fibo1 = 1;
			int fibo2 = 1;

			for (int i = 3; i <= term; i++) {

				fibonacci = fibo1 + fibo2;
				fibo1 = fibo2;
				fibo2 = fibonacci;
			}
			return fibonacci;
		}
	}

}