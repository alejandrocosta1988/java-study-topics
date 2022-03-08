package dev.alejandrocosta.EnumDemonstrations;

import java.util.Scanner;

import dev.alejandrocosta.model.Size;

/**
 * This program demonstrates the use of enumeration classes.
 * @author alejandro_costa
 * @version 0.1 2022-03-08
 */
public class DemonstrationEnum {

	public static void main(String[] args) 
	{
		
		var in = new Scanner(System.in);
		
		System.out.print("Enter a size of your choice: (SMALL, MEDIUM, LARGE, EXTRA_LARGE)\n> ");
		String input = in.next().toUpperCase();
		in.close();
		
		//values are set using method Enum.valueOf()
		Size size = Enum.valueOf(Size.class, input);
		System.out.println("Chosen size: " + size);
		System.out.println("Abbreviation: " + size.getAbbreviation());
		
		//comparisons should be made using the == operator
		if (size == Size.EXTRA_LARGE) System.out.println("Good job -- you paid attention to the _.");
		
		//values can be converted to strings
		System.out.println(size.toString());
		
		//ordinal position of the enumerated constant within the enumeration class
		System.out.println(size.ordinal());
		

	}

}
