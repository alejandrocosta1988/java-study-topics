package dev.alejandrocosta.functionalDemonstrations;

import java.util.Arrays;

/**
 * Demonstrates the use of lambda expressions.
 * @author Alejandro Costa
 * @version 0.1 2022-03-15
 */
public class LambdaDemonstration {

	public static void main(String[] args) {
		
		var planets = new String[] {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
		
		System.out.println(Arrays.toString(planets));
		
		System.out.println("Sorted in dictionary order:");
		Arrays.sort(planets);
		System.out.println(Arrays.toString(planets));

		System.out.println("Sorted by length:");
		Arrays.sort(planets, (firstPlanet, secondPlanet) -> firstPlanet.length() - secondPlanet.length());
		System.out.println(Arrays.toString(planets));
		
	}
}
