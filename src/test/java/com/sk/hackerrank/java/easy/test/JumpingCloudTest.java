/*
Copyright [2024] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
package com.sk.hackerrank.java.easy.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sk.hackerrank.java.easy.JumpingCloud;

/**
* @author - Shreyans Khobare
* Hackerrank link: https://www.hackerrank.com/challenges/jumping-on-the-clouds-revisited/problem?isFullScreen=true
*/
class JumpingCloudTest {
	
	private JumpingCloud subjectUnderTest;

	@BeforeEach
	void setUp() throws Exception {
		
		subjectUnderTest = new JumpingCloud();
		
	}

	@Test
	void testJumpingOnClouds_One() {
		
		int[] request = {0, 0, 1, 0, 0, 1, 1, 0};
		assertEquals(92, subjectUnderTest.jumpingOnClouds(request, 2));
		
	}
	
	@Test
	void testJumpingOnClouds_Two() {
		
		int[] request = {1, 1, 1, 0, 1, 1, 0, 0, 0, 0};
		assertEquals(80, subjectUnderTest.jumpingOnClouds(request, 3));
		
	}

}
