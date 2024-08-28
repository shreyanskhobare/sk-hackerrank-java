/*
Copyright [2024] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
package com.sk.hackerrank.java.easy.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sk.hackerrank.java.easy.LibraryFine;

/**
* @author - Shreyans Khobare
* Hackerrank link: https://www.hackerrank.com/challenges/library-fine/problem?isFullScreen=true
*/
class LibraryFineTest {
	
	private LibraryFine subjectUnderTest;

	@BeforeEach
	void setUp() throws Exception {
		
		subjectUnderTest = new LibraryFine();
		
	}

	@Test
	void testLibraryFine_One() {
		assertEquals(45, subjectUnderTest.libraryFine(9, 6, 2015, 6, 6, 2015));
	}
	
	@Test
	void testLibraryFine_Two() {
		assertEquals(10000, subjectUnderTest.libraryFine(9, 6, 2017, 6, 6, 2015));
	}
	
	@Test
	void testLibraryFine_Three() {
		assertEquals(0, subjectUnderTest.libraryFine(9, 6, 2012, 6, 6, 2015));
	}

}
