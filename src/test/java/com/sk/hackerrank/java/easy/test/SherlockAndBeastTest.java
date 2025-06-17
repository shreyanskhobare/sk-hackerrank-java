/*
Copyright [2024] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
package com.sk.hackerrank.java.easy.test;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sk.hackerrank.java.easy.SherlockAndBeast;

/**
* @author - Shreyans Khobare
*/
class SherlockAndBeastTest {

	private SherlockAndBeast subjectUnderTest;
	
	@BeforeEach
	void setUp() throws Exception {
		
		subjectUnderTest = new SherlockAndBeast();
		
	}

	@Test
	void testDecentNumber() {
		subjectUnderTest.decentNumber(11);
	}

}
