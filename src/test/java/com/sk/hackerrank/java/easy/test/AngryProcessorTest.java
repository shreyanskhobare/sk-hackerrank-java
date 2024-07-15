/*
Copyright [2024] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
package com.sk.hackerrank.java.easy.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sk.hackerrank.java.easy.AngryProfessor;

/**
* @author - Shreyans Khobare
*/
/**
 * Hackerrank: https://www.hackerrank.com/challenges/angry-professor/problem?isFullScreen=true
 */
class AngryProcessorTest {

	private AngryProfessor subjectUnderTest;
	private static final String YES = "YES";
	private static final String NO = "NO";
	
	
	@BeforeEach
	void setUp() throws Exception {
		subjectUnderTest = new AngryProfessor();
	}

	@Test
	void test_Cancelled() {
		Integer[] attend = {-1,-3,4,2};
		List<Integer> attendance = Arrays.asList(attend);
		String response = subjectUnderTest.angryProfessor(3, attendance);
		assertEquals(YES, response);
	}
	
	@Test
	void test_NotCancelled() {
		Integer[] attend = {0,-1,2,1};
		List<Integer> attendance = Arrays.asList(attend);
		String response = subjectUnderTest.angryProfessor(3, attendance);
		assertEquals(YES, response);
	}

}
