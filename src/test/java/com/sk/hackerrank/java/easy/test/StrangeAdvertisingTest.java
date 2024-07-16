/*
Copyright [2024] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
package com.sk.hackerrank.java.easy.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sk.hackerrank.java.easy.StrangeAdvertising;

/**
* @author - Shreyans Khobare
* Hackerrank Link: https://www.hackerrank.com/challenges/strange-advertising/problem?isFullScreen=true
*/
class StrangeAdvertisingTest {

	private StrangeAdvertising subjectUnderTest;
	
	@BeforeEach
	void setUp() throws Exception {
		
		subjectUnderTest = new StrangeAdvertising();
		
	}

	@Test
	void testViralAdvertising_One() {
		assertEquals(9, subjectUnderTest.viralAdvertising(3));
	}
	
	@Test
	void testViralAdvertising_Two() {
		assertEquals(15, subjectUnderTest.viralAdvertising(4));
	}

}
