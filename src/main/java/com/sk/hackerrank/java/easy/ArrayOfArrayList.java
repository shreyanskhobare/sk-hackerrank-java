/*
Copyright [2025] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
package com.sk.hackerrank.java.easy;

import java.util.ArrayList;
import java.util.Scanner;

/**
* @author - Shreyans Khobare
* Hackerrank Link: https://www.hackerrank.com/challenges/java-arraylist/problem
*/
public class ArrayOfArrayList {

	
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        int totalRows = scan.nextInt();
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
        
        
        for (int i=0; i<totalRows; i++) {
            
            int columnCount = scan.nextInt();
            
            ArrayList<Integer> rowList = new ArrayList<>();
            for (int j=0; j<columnCount; j++) {
                
                rowList.add(scan.nextInt());
                
            }
            arrayList.add(rowList);
            
        }
        
        int numberOfQueries = scan.nextInt();
        for (int i=0; i<numberOfQueries; i++) {
            
            int positionX = scan.nextInt();
            int positionY = scan.nextInt();
            
            if (positionX > totalRows) {
                System.out.println("ERROR!");
                continue;
            }
            
            if (positionY > arrayList.get(positionX-1).size()) {
                System.out.println("ERROR!");
                continue;
            }
            
            System.out.println(arrayList.get(positionX-1).get(positionY-1));
            
        }
        
    }
	
	
}
