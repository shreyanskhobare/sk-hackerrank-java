/*
Copyright [2024] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
package com.sk.hackerrank.java.easy;

/**
* @author - Shreyans Khobare
* Hackerrank : https://www.hackerrank.com/challenges/save-the-prisoner/problem
*/
public class SavePrisonerRoundTable {
	
    /*
     * Complete the 'saveThePrisoner' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER m
     *  3. INTEGER s
     */

    public int saveThePrisoner(int n, int m, int s) {

    	// Write your code here
        return (m - 1  + s - 1 ) % n + 1;

    }

}
