// Copyright (c) 2019, Matthew Chalifoux.

/**
   Program to test whether a string is contained within a string
 */

import java.util.Scanner;

public class pfiveseventeen {
	
	public static boolean find(String str, String match) {
		
		
		int check = 0;
		boolean over = false;
		int i = 0;
		boolean isIt = false;
		int start = i;
		
		
		
		do {
			
			if(str.charAt(i) == match.charAt(i)) {
				++i;
				if(i == match.length()) {
					over = true;
					isIt = true;
					System.out.println("str = " + str);
				}
			}
			else if(str.charAt(i) != match.charAt(i)) {
				over = true;
			}			
		} while(over == false);
		
		
		
		if(isIt == true) {
			return true;
		}
		else {
			start = start + 1;
			String sub = str.substring(start);
			System.out.println("sub = " + sub);
			if(sub.length() < match.length()) {
				return false;
			}
			else {
				return find(sub, match);
			}
		}	
		
	}
	
	public static void main(String[] args) {
		
		
//		Scanner in = new Scanner(System.in);
		
//		System.out.println("Enter a string : ");
//		
//		String str = in.next();
//		
//		System.out.println("Enter substring that will be searched within : " + str);
//		
//		String match = in.next();
		
		
		boolean b = find("Mississippi", "sip");
		
		if(b == true) {
			System.out.println("It is a match!");			
		}
		else {
			System.out.println("Not a match!");
		}
		
		
		
	}
}
