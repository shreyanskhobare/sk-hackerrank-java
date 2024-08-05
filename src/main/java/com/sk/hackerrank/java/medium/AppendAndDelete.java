/*
Copyright [2024] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
package com.sk.hackerrank.java.medium;

/**
 * @author - Shreyans Khobare Hackerrank Link:
 *         https://www.hackerrank.com/challenges/append-and-delete/problem?isFullScreen=true
 */
public class AppendAndDelete {

	/*
	 * Complete the 'appendAndDelete' function below.
	 *
	 * The function is expected to return a STRING. The function accepts following
	 * parameters: 1. STRING s 2. STRING t 3. INTEGER k
	 */

	public String appendAndDelete(String s, String t, int k) {
		// Write your code here

		String response = "No";

		if (s.length() + t.length() <= k) {
			return "Yes";
		}

		String[] s1 = s.split("");
		String[] t1 = t.split("");

		int same = 0;
		for (int i = 0; i < t1.length && i < s1.length; i++) {

			if (s1[i].equalsIgnoreCase(t1[i])) {
				same++;
			} else {
				break;
			}

		}

		System.out.println(same);
		int removeAndAdd = (s1.length - same) + (t1.length - same);
		int difference = k - removeAndAdd;

		if (difference >= 0 && difference % 2 == 0) {
			return "Yes";
		}

		return response;

	}

}
