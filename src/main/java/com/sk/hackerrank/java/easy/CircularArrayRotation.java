/*
Copyright [2024] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
package com.sk.hackerrank.java.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author - Shreyans Khobare Hackerrank link:
 *         https://www.hackerrank.com/challenges/circular-array-rotation/problem
 */
public class CircularArrayRotation {

	/*
	 * Complete the 'circularArrayRotation' function below.
	 *
	 * The function is expected to return an INTEGER_ARRAY. The function accepts
	 * following parameters: 1. INTEGER_ARRAY a 2. INTEGER k 3. INTEGER_ARRAY
	 * queries
	 */

	public List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
		// Write your code here
		List<Integer> response = new ArrayList<>();
		
		int mod = k % a.size();
		for (Integer index : queries) {

			/**
			 * After 1st rotation, the 0th position of the new arrangement will have: a[0 -
			 * 1] = a[-1], t he last element of the original is now at 0. This can be
			 * applied to all indices to be searched.
			 */

			int indexResponse = (index - mod + a.size()) % a.size();
			response.add(a.get(indexResponse));

		}

		return response;

	}

}
