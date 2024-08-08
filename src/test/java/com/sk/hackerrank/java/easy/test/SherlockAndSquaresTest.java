/*
Copyright [2024] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
package com.sk.hackerrank.java.easy.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;
import java.time.Instant;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sk.hackerrank.java.easy.SherlockAndSquares;

/**
* @author - Shreyans Khobare
* Hackerrank link: https://www.hackerrank.com/challenges/sherlock-and-squares/problem?isFullScreen=true
*/
class SherlockAndSquaresTest {

	private SherlockAndSquares subjectUnderTest;
	int[] first = new int[100];
	int[] second = new int[100];
	int[] expected = {9855,3672,311,867,10270,6352,12435,10760,13884,3043,220,260,8607,23170,2867,20457,15490,10804,10090,11135,14690,701,12586,9378,12839,21609,16479,8751,15700,20953,7035,22444,11601,9542,9724,3413,1482,6171,8999,13543,9234,6672,6690,5564,5270,13054,8534,12084,4996,4410,5613,7848,4103,8093,6783,250,21818,5494,5355,1126,27521,10265,9436,8630,3678,15661,11773,24786,6895,8162,3328,2513,6283,6612,2176,8935,10904,1682,7684,2021,11312,7042,6794,4214,11620,6975,5968,600,8443,12176,7599,2034,5786,12025,3309,23201,7944,9763,11993,16518};
	
	@BeforeEach
	void setUp() throws Exception {
		
		subjectUnderTest = new SherlockAndSquares();
		setRequest();
		
	}

	private void setRequest() {
		
		int[] input = {465868129,988379794,181510012,293922871,395151610,407596310,481403421,520201871,309804254,776824625,304742289,566848910,267554756,828997506,387224568,926504395,244571677,871603971,444567315,582147918,334350264,342469009,400474096,410940967,488907300,943628573,26441071,801576263,182001128,267557939,115732998,974318256,192538332,862327048,45429427,307805497,358658006,842644090,92930998,431601473,231163983,893672132,275221547,298953978,351237326,981399371,484598992,985428966,103405553,529324202,37393469,768655346,30179914,482808626,208821550,538302223,154654533,791652309,68424067,854065374,246956110,517538724,51395253,876949418,57778758,368742600,227566632,606529208,360551779,824396068,396042598,543511438,411041425,473345854,469310505,774761014,90386202,342472887,79110819,503433812,444288332,918848597,280603787,548642983,127990618,324129686,479256115,753819852,253766533,449479844,332623760,979143500,122448725,384124626,101854341,491806437,324275294,529171976,378385813,569430598,152484569,322626345,397853336,772523199,126282101,235322141,327610187,686112903,353962429,655163953,391009046,400936407,45488493,815834125,394001259,642294484,111624270,253455511,220990588,255719882,10907106,950118387,177210402,555916808,316351449,741082827,425556581,856116768,421507248,586064719,93888922,642637722,99843590,473754317,8213634,764585393,488097822,840278753,435342015,842508745,349406673,484900634,280010853,370443835,400888260,691956893,421748251,737067324,305905572,386773097,435191289,887843065,260846393,731941575,445631476,519474101,59915010,237909218,306805801,381681659,324432467,859919996,279649964,564769173,118888227,313212102,302008280,466227315,321239164,872789513,207077522,456470830,242838944,464459846,43481253,51762643,208198294,523145398,47696526,364130319,179957324,441551904,50523163,83566712,478585845,765208335,75756080,429669067,475218138,630450638,55559381,939697803,240414829,549868781,420846535,916723099,329104468,908085028,150336667,828238028};
		int index = 0;
		for (int i=0; i<input.length;) {
			
			first[index] = input[i];
			i++;
			second[index] = input[i];
			i++;
			index++;
			
		}
		
	}

	@Test
	void testSquares_MySolution() {
		
		Instant start = Instant.now();
		for (int i = 0; i<100; i++) {
			
			assertEquals(expected[i], subjectUnderTest.squares_MySolution(first[i], second[i]));
			
		}
		Instant end = Instant.now();
    	Duration time = Duration.between(start, end);
    	System.out.println("MySolution: " + time.toMillis());
		
	}

	@Test
	void testSquares_BetterSolution1() {
		Instant start = Instant.now();
		for (int i = 0; i<100; i++) {
			
			assertEquals(expected[i], subjectUnderTest.squares_BetterSolution1(first[i], second[i]));
			
		}
		Instant end = Instant.now();
    	Duration time = Duration.between(start, end);
    	System.out.println("First Better Solution: " + time.toMillis());
	}

	@Test
	void testSquares_BetterSolution2() {
		Instant start = Instant.now();
		for (int i = 0; i<100; i++) {
			
			assertEquals(expected[i], subjectUnderTest.squares_BetterSolution2(first[i], second[i]));
			
		}
		Instant end = Instant.now();
    	Duration time = Duration.between(start, end);
    	System.out.println("Second Better Solution: " + time.toMillis());
	}
	
	
}
