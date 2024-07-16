/*
Copyright [2024] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
package com.sk.hackerrank.java.easy;

/**
* @author - Shreyans Khobare
*/

public class UtopianTree_Simple {

    /*
     * Complete the 'utopianTree' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public int utopianTree(int n) {
    // Write your code here
        int response = 1;
        for (int i=1;i<=n;i++) {
            
            if (i%2==0) {
                response += 1;
            } else {
                response *= 2;
            }
            
        }
        
        return response;

    }

}
