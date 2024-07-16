/*
Copyright [2024] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
package com.sk.hackerrank.java.easy.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sk.hackerrank.java.easy.SavePrisonerRoundTable;

/**
* @author - Shreyans Khobare
* Hackerrank: https://www.hackerrank.com/challenges/save-the-prisoner/problem
*/
class SavePrisonerRoundTableTest {

	private SavePrisonerRoundTable subjectUnderTest;
	
	@BeforeEach
	void setUp() throws Exception {
		
		subjectUnderTest = new SavePrisonerRoundTable();
		
	}

	@Test
	void test_One() {
		
		assertEquals(122129406, subjectUnderTest.saveThePrisoner(352926151, 380324688, 94730870));
		
	}
	
	@Test
	void test_Two() {
		
		assertEquals(23525398, subjectUnderTest.saveThePrisoner(94431605, 679262176, 5284458));
		
	}

}
