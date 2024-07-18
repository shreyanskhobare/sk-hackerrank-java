/*
Copyright [2024] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
package com.sk.hackerrank.java.easy;

/**
* @author - Shreyans Khobare
* Hackerrank link: https://www.hackerrank.com/challenges/jumping-on-the-clouds-revisited/problem?isFullScreen=true
*/
public class JumpingCloud {

    public int jumpingOnClouds(int[] c, int k) {

        int energy = 100;
        int index = 0;
        while (energy > 0) {
            
            index = (index + k) % c.length;
            
            energy -= 1;
            if (c[index] == 1) {
                energy -= 2;
            }
            
            if (index == 0) {
                break;
            }
            
        }
        
        return energy;
    }
	
}
