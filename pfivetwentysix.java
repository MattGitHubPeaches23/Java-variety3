// Copyright (c) 2019, Matthew Chalifoux.

/**
   Program to read in a bar code and output the zip code
 */

import java.util.Scanner;
 
public class pfivetwentysix {
		
	
	public static void main(String[] args) {
					
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter bar code : ");
		
		String input = in.next();
		
		if(input.charAt(0) != '|') {
			System.out.println("Input fail!");
		}
		if(input.charAt(input.length() - 1) != '|') {
			System.out.println("Input fail!");
		}
		
				
		
	   String key[] = {"||:::",":::||","::|:|","::||:",":|::|",":|:|:",":||::","|:::|","|::|:","|:|::"};
	   
	   int a = 1;
	   int b = 6;
	   String sub = "";
	   
	   
	   System.out.println("sub = " + sub);
	   
//	   if(sub.equals(key[9])) {
//		   System.out.println("It is TOO also equal");
//	   }
	   
	   boolean total = true;
	   boolean over = false;
	   boolean match = false;
	   String number = "";
	   
	   for(int j = 0; j < 5; ++j) {
		   
		   sub= input.substring(a, b);
		   
		   for(int i = 0; i < 10; ++i) {
				  
				  
				  // ||:|:::|:|:||::::::||:|::|:::|||
				  
				  
				  boolean maybe = false;
				  	  	  
				  
				  if(sub.equals(key[i])) {
					  number += i;
					  i = 9;
					  over = true;
					  System.out.println("sub = " + sub);
					  System.out.println("number = " + number);
					  a += 5;
					  b += 5;
				  }
				  if(9 == i && over == false) {
					  System.out.println("Invalid input.");
					  j = 4;
				  }				  
			  }		   
	   }
	   	  
	  	
	  System.out.println("number = " + number);
		
	}
}
