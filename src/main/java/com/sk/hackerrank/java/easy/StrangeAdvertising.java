/*
Copyright [2024] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
package com.sk.hackerrank.java.easy;

/**
* @author - Shreyans Khobare
* Hackerrank link: https://www.hackerrank.com/challenges/strange-advertising/problem?isFullScreen=true
*/
public class StrangeAdvertising {
	
    /*
     * Complete the 'viralAdvertising' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public int viralAdvertising(int n) {
    // Write your code here
    
        int response = 0;
        int shared = 5;
        for (int i=0; i<n;i++) {
            
            int floor = Math.floorDiv(shared, 2);
            response += floor;
            shared = floor * 3;
            
        }
        
        return response;

    }

}
