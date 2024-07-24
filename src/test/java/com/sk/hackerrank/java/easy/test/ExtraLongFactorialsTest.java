/*
Copyright [2024] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
package com.sk.hackerrank.java.easy.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigInteger;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sk.hackerrank.java.easy.ExtraLongFactorials;

/**
* @author - Shreyans Khobare
* Hackerrank link: https://www.hackerrank.com/challenges/extra-long-factorials/problem
*/
class ExtraLongFactorialsTest {

	private ExtraLongFactorials subjectUnderTest;
	
	@BeforeEach
	void setUp() throws Exception {
		
		subjectUnderTest = new ExtraLongFactorials();
		
	}

	@Test
	void testExtraLongFactorials_One() {
		
		assertEquals(new BigInteger("15511210043330985984000000"), subjectUnderTest.extraLongFactorials(25));
		
	}
	
	@Test
	void testExtraLongFactorials_Two() {
		
		assertEquals(new BigInteger("119622220865480194561963161495657715064383733760000000000"), subjectUnderTest.extraLongFactorials(45));
		
	}

}
