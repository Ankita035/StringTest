/* Write a Program to take a user-defined input in which 
1. All Upper Case letters should be shifted left by 2 characters
2.All Lower Case letters should be shifted left by 3 characters

Sample Input:
User gives input as "Hello"
Output should be: "Fbiil"	*/

	package com.Shifting;

import java.util.Scanner;

public class LeftShifting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;								//Initializing the variable
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");//Taking input from user
		String a = sc.nextLine();
		String output="";
									//used loop for every letter
		for(i=0 ; i<a.length(); i++){
			if(Character.isUpperCase(a.charAt(i))) {
									//checking if the character is Upper Case
				if(a.charAt(i) == 'A') {
									//if the character is A it should shift to Y
					output=output+"Y";
				}
				else if (a.charAt(i)=='B') {
									//if the character is B it should shift to Z
					output=output+"Z";
				}
				else {
									//Similarly very other character is shifting to the left twice
					output=output+(char)(a.charAt(i)-2);
				}		
			}
									//if the character is Lower Case
		if(a.charAt(i)>='a' && a.charAt(i)<='z') {
									//The character is shifting to the left thrice
			output=output+(char)('a'+(a.charAt(i)-'a'+23)%26);
			}
		}
									//Showing the output
		System.out.println("The Shifted Output is: "+ output);
	}
}
