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

import com.sk.hackerrank.java.easy.DesignerPdfAlphabetValueBasedOnIndexLocation;

/**
* @author - Shreyans Khobare
*/
/**
 * Hackerrank link: https://www.hackerrank.com/challenges/designer-pdf-viewer/problem
 */
class DesignerPdfAlphabetValueBasedOnIndexLocationTest {

	private DesignerPdfAlphabetValueBasedOnIndexLocation subjectUnderTest;
	
	@BeforeEach
	void setUp() throws Exception {
		subjectUnderTest = new DesignerPdfAlphabetValueBasedOnIndexLocation();
	}

	@Test
	void testDesignerPdfViewer_One() {
		
		Integer[] input = {1,3,1,3,1,4,1,3,2,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5};
		List<Integer> h = Arrays.asList(input);
		int response = subjectUnderTest.designerPdfViewer(h, "abc");
		assertEquals(9, response);
		
	}
	
	@Test
	void testDesignerPdfViewer_Two() {
		
		Integer[] input = {1,3,1,3,1,4,1,3,2,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,7};
		List<Integer> h = Arrays.asList(input);
		int response = subjectUnderTest.designerPdfViewer(h, "zaba");
		assertEquals(28, response);
		
	}

}
