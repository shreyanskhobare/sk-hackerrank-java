/*
Copyright [2024] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
package com.sk.hackerrank.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
* @author - Shreyans Khobare
*/
/**
 * Hackerrank Link:
 * https://hackerrank.com/challenges/climbing-the-leaderboard/problem?isFullScreen=true
 */
public class ArcadeGameRankPlayer {

	/*
	 * Complete the 'climbingLeaderboard' function below.
	 *
	 * The function is expected to return an INTEGER_ARRAY. The function accepts
	 * following parameters: 1. INTEGER_ARRAY ranked 2. INTEGER_ARRAY player
	 */

	public List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
		// Write your code here
		List<Integer> response = new ArrayList<>();

		List<Integer> withoutRepetition = new ArrayList<>();
		withoutRepetition.add(ranked.get(0));
		for (int i = 1; i < ranked.size(); i++) {

			int compare = Integer.compare(ranked.get(i), ranked.get(i - 1));
			if (compare != 0) {
				withoutRepetition.add(ranked.get(i));
			}

		}

		/**
		 * Kept array without any repetition. Better Solution using Stream:
		 
		 List<Integer> withoutRepetition = ranked.stream().distinct().collect(Collectors.toList());
		 * 
		 */

		int rank = withoutRepetition.size() - 1;
		for (Integer score : player) {

			if (score >= withoutRepetition.get(0)) {
				// If score is greater than maximum value in ranked list
				response.add(1);

			} else if (score < withoutRepetition.get(withoutRepetition.size() - 1)) {
				// If score is lesser than minimum value in ranked list
				response.add(withoutRepetition.size() + 1);

			} else {

				while (rank > 0 && score >= withoutRepetition.get(rank - 1)) {
					// Iterate over list from right to left comparing values
					rank--;
				}
				response.add(rank + 1);

			}

		}

		return response;
	}

}
