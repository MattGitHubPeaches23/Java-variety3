// Copyright (c) 2019, Matthew Chalifoux.

/**
   Program to create a password with at least one digit, 8 char long, one upper and lower case char
 */

import java.util.Scanner;



public class pfivethirty {
	
	public static String firstInput(){
		
		Scanner in = new Scanner(System.in);				
		
		
		
		String ogPW = "";
		boolean shutOff = false;
		
		do {
			ogPW = "";
			shutOff = false;
			boolean length = false;
			boolean upper = false;
			boolean lower = false;
			boolean digit = false;
			
			
			System.out.println("Enter a 8 character password.");
			System.out.println("Must have at least one digit, one upper case and one lower chase character : ");
			
			ogPW = in.next();
			
			if(8 != ogPW.length()) {
				shutOff = true;
			}
			else if(8 == ogPW.length()) {
				length = true;
			}
			
			if(shutOff != true) {
				for(int i = 0; i < ogPW.length(); ++i) {
					
					char sub = ogPW.charAt(i);
					
					if(true == Character.isDigit(sub) && digit == false) {
						digit = true;
					}
					
					else if(true == Character.isLetter(sub)) {
						if(upper != true) {
							if(Character.isUpperCase(ogPW.charAt(i))) {
								upper = true; 
							}
						}
						if(lower != true) {
							if(Character.isLowerCase(ogPW.charAt(i))) {
								lower = true; 
							}
						}
					}		
				}				
			}		
			
			if(length == false || upper == false || lower == false || digit == false) {
				System.out.println("Invalid input");
				shutOff = true;
			}			
		} while(shutOff == true);
		
		
		return ogPW;
	}
	
	public static boolean secondInput(String ogPW) {
		
		Scanner in = new Scanner(System.in);		
		
		boolean over = false;
		
		System.out.println("Re-enter password");
		
		String compare = in.next();
		
		if(compare.length() != ogPW.length()) {
			return false;
		}
		
		for(int i = 0; i < ogPW.length(); ++i) {
			
			char n = compare.charAt(i);
			char o = ogPW.charAt(i);
			
			if(n != o) {
				System.out.println("Passwords do not match");
				return false;
			}						
		}
		
		
		return true;
	}
	
	
	public static void main(String[] args) {
		
		
		
		String ogPW = firstInput();
		boolean over = false;
		
		while(over == false) {
			if(secondInput(ogPW) == true) {
				System.out.println("Password Created!");
				over = true;
			}
			else {
				ogPW = firstInput();
			}
		}		
		
	}
}
