/*
Copyright [2024] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
package com.sk.hackerrank.java.easy;

/**
 * @author - Shreyans Khobare
 * Hackerrank link: https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem?isFullScreen=true
 */
public class BeautifulDayReverseDifferenceDivision {

	/*
	 * Complete the 'beautifulDays' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts following
	 * parameters: 1. INTEGER i 2. INTEGER j 3. INTEGER k
	 */

	public int beautifulDays(int i, int j, int k) {
		// Write your code here
		int beautifulDays = 0;
		for (int num = i; num <= j; num++) {

			String number = String.valueOf(num);
			String reverse = new StringBuffer(number).reverse().toString();
			int reversed = Integer.parseInt(reverse);

			if (((Math.abs(reversed - num)) % k) == 0) {
				beautifulDays++;
			}

		}

		return beautifulDays;

	}

}
