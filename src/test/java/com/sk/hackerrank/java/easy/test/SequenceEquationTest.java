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

import com.sk.hackerrank.java.easy.SequenceEquation;

/**
* @author - Shreyans Khobare
* Hackerrank link: https://www.hackerrank.com/challenges/permutation-equation/problem
*/
class SequenceEquationTest {

	private SequenceEquation subjectUnderTest;
	
	@BeforeEach
	void setUp() throws Exception {
		
		subjectUnderTest = new SequenceEquation();
		
	}

	@Test
	void testPermutationEquation_One() {
		
		Integer[] array = {5,2,1,3,4};
		List<Integer> input = Arrays.asList(array);
		
		Integer[] expected = {4,2,5,1,3};
		List<Integer> response = Arrays.asList(expected);
		
		assertEquals(response, subjectUnderTest.permutationEquation(input));
		
	}
	
	@Test
	void testPermutationEquation_Two() {
		
		Integer[] array = {4,3,5,1,2};
		List<Integer> input = Arrays.asList(array);
		
		Integer[] expected = {1,3,5,4,2};
		List<Integer> response = Arrays.asList(expected);
		
		assertEquals(response, subjectUnderTest.permutationEquation(input));
		
	}

}
