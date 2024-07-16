/*
Copyright [2024] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
package com.sk.hackerrank.java.easy.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sk.hackerrank.java.easy.UtopianTree_Simple;

/**
* @author - Shreyans Khobare
*/
class UtopianTreeTest {

	private UtopianTree_Simple subjectUnderTest;
	
	@BeforeEach
	void setUp() throws Exception {
		
		subjectUnderTest = new UtopianTree_Simple();
		
	}

	@Test
	void test_One() {
		assertEquals(subjectUnderTest.utopianTree(0), 1);
	}
	
	@Test
	void test_Two() {
		assertEquals(subjectUnderTest.utopianTree(2), 3);
	}

}
