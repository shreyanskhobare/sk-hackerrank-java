/*
Copyright [2024] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
package com.sk.hackerrank.java.easy;

import java.math.BigInteger;

/**
 * @author - Shreyans Khobare Hackerrank link:
 * Hackerrank link: https://www.hackerrank.com/challenges/extra-long-factorials/problem
 */
public class ExtraLongFactorials {

	/*
	 * Complete the 'extraLongFactorials' function below.
	 *
	 * The function accepts INTEGER n as parameter.
	 */

	public BigInteger extraLongFactorials(int n) {
		// Write your code here
		
		BigInteger factorial = new BigInteger("1");
		for (int i = 1; i <= n; i++) {
			factorial = factorial.multiply(new BigInteger(i + ""));
		}

		return factorial;

	}

}
