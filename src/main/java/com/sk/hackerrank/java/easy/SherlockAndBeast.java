/*
Copyright [2024] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
package com.sk.hackerrank.java.easy;

/**
* @author - Shreyans Khobare
*/
public class SherlockAndBeast {
	
	public void decentNumber(int n) {
		
		/*
		 * if (n%3==0 || n%5==0) { String output = ""; if (n%3==0) { for (int i=0; i <
		 * n; i++) { output += 5; } } if (n%5 == 0) { for (int i=0; i<n; i++) { output
		 * += 3; } } System.out.println(output); } else { System.out.println(-1); }
		 */
		
		String display = "";
		
		if (n%5 == 0) {
			
			for (int i=0; i<n; i++) {
				display += 3;
			}
			System.out.println(display);
			return;
			
		}
		
		if (n%3 == 0) {
			
			for (int i=0; i<n; i++) {
				display += 5;
			}
			System.out.println(display);
			return;
			
		}
		
		int remainderFive = n%5;
		if (remainderFive % 3 == 0) {
			
			for (int i=0; i<n/5; i++) {
				display += 3;
			}
			
			for (int j=0; j<(n/5)/3; j++) {
				display +=5;
			}
			System.out.println(display);
			return;
			
		}
		
		System.out.println("-1");
		return;
		
	}

}
