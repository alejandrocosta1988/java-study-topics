package dev.alejandrocosta.model;

/**
 * Defines a generic enumeration class for sizes. This class will be used in demonstrations of different topics using the Java language.
 * @author alejandro_costa
 * @version 0.1 2022-03-08
 */
public enum Size 
{
	
	SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");
	
	private String abbreviation;
	
	private Size(String abbreviation)
	{
		this.abbreviation = abbreviation;
	}
	
	public String getAbbreviation()
	{
		return this.abbreviation;
	}
}
