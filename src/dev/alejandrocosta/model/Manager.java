package dev.alejandrocosta.model;

import java.util.Objects;

/**
 * Defines a generic class for managers, which extends employees.
 * @author Alejandro Costa
 * @version 0.1 2022-03-11
 */
public class Manager extends Employee
{
	
	private double bonus;
	
	public Manager(String name, double salary, int year, int month, int day)
	{
		super(name, salary, year, month, day);
		this.bonus = 0;
	}
	
	/**
	 * Calculates the salary of the manager taking into account his/her bonus.
	 * @return A double with the salary.
	 * @since 0.1 2022-03-11
	 */
	@Override
	public double getSalary()
	{
		double baseSalary = super.getSalary();
		return baseSalary + this.bonus;
	}
	
	public void setBonus(double bonus)
	{
		this.bonus = bonus;
	}

	public int hashCode() 
	{
		return java.util.Objects.hash(super.hashCode(), bonus);
	}

	public boolean equals(Object otherObject) 
	{
		if (!super.equals(otherObject)) return false;
		var other = (Manager) otherObject;
		return this.bonus == otherObject.bonus;
	}
	
	public String toString()
	{
		return super.toString() + "[bonus = " + this.bonus + "]";
	}
	
}
