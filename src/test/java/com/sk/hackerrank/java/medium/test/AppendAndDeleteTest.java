/*
Copyright [2024] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
package com.sk.hackerrank.java.medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sk.hackerrank.java.medium.AppendAndDelete;

/**
* @author - Shreyans Khobare
*/
class AppendAndDeleteTest {
	
	private AppendAndDelete subjectUnderTest;

	@BeforeEach
	void setUp() throws Exception {
		
		subjectUnderTest = new AppendAndDelete();
		
	}

	@Test
	void testAppendAndDelete() {
		
		String s = "abc";
		String t = "def";
		int k = 6;
		
		assertEquals("Yes", subjectUnderTest.appendAndDelete(s, t, k));
		
	}
	
	@Test
	void testAppendAndDelete_Two() {
		
		String s = "qwerasdf";
		String t = "qwerbsdf";
		int k = 6;
		
		assertEquals("No", subjectUnderTest.appendAndDelete(s, t, k));
		
	}
	
	@Test
	void testAppendAndDelete_Three() {
		
		String s = "zzzzz";
		String t = "zzzzzzz";
		int k = 4;
		
		assertEquals("Yes", subjectUnderTest.appendAndDelete(s, t, k));
		
	}
	
	@Test
	void testAppendAndDelete_Four() {
		
		String s = "aba";
		String t = "aba";
		int k = 7;
		
		assertEquals("Yes", subjectUnderTest.appendAndDelete(s, t, k));
		
	}
	
	@Test
	void testAppendAndDelete_Five() {
		
		String s = "abcdef";
		String t = "fedcba";
		int k = 15;
		
		assertEquals("Yes", subjectUnderTest.appendAndDelete(s, t, k));
		
	}

}
