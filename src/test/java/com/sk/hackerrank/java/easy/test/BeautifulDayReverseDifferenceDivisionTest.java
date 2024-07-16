/*
Copyright [2024] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
package com.sk.hackerrank.java.easy.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sk.hackerrank.java.easy.BeautifulDayReverseDifferenceDivision;

/**
* @author - Shreyans Khobare
*/
class BeautifulDayReverseDifferenceDivisionTest {

	private BeautifulDayReverseDifferenceDivision subjectUnderTest;
	
	@BeforeEach
	void setUp() throws Exception { 
		
		subjectUnderTest = new BeautifulDayReverseDifferenceDivision();
		
	}

	@Test
	void testBeautifulDays_One() {
		assertEquals(2, subjectUnderTest.beautifulDays(20, 23, 6));
	}
	
	@Test
	void testBeautifulDays_Two() {
		assertEquals(33, subjectUnderTest.beautifulDays(13, 45, 3));
	}

}
