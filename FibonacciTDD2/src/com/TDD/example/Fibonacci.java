package com.TDD.example;

public class Fibonacci {

	
	/**
	 * Gives a value of a Fibonacci sequence for given term.
	 * 
	 * @param term, the term for which will be calculated Fibonacci value.
	 * 
	 * @return suitable value for given term.
	 */
	
	public static int getFiboValue(int term) {
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
	public static int getEvenTermsFiboValuesSum(int MaxTerm) {
		int FiboSum = 0;
		for (int i = 0; i <= MaxTerm; i++) {

			if (i % 2 == 0 && getFiboValue(i) <= 4000000)
				FiboSum += getFiboValue(i);

		}
		return FiboSum;
	}
}