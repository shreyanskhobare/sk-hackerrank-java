/*
Copyright [2024] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
package com.sk.hackerrank.java.easy;

import java.util.List;

/**
* @author - Shreyans Khobare
*/
/**
 * Hackerrank: https://www.hackerrank.com/challenges/angry-professor/problem?isFullScreen=true
 */
public class AngryProfessor {
	
    /*
     * Complete the 'angryProfessor' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY a
     */

    public String angryProfessor(int k, List<Integer> a) {
    // Write your code here
    
        int pass = 0;
        int fail = 0;
        int failCount = a.size() - k;
        for (Integer attend : a) {
            
            if (attend > 0) {
                fail++;
                if (fail >= failCount) {
                    return "YES";
                }
            } else {
                
                pass++;
                if (pass >= k) {
                    return "NO";
                }
                
            }
            
        }
        
        if (pass >= k) {
            return "NO";
        }
        return "YES";

    }

}
