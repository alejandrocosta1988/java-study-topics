package dev.alejandrocosta.model;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Defines a generic class for employees. This class will be used in demonstrations of different topics using the Java language.
 * The class Employee implements the interface Comparable to allow comparisons between Employee instances.
 * @author Alejandro Costa
 * @version 0.2 2022-03-09
 */
public class Employee implements Comparable<Employee>
{
	private String name;
	private double salary;
	private LocalDate hireDay;
	
	public Employee(String nome, double salary, int year, int month, int day)
	{
		this.name = nome;
		this.salary = salary;
		this.hireDay = LocalDate.of(year, month, day);
	}

	
	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	/**
	 * Method to get the date in which the employee was hired.
	 * @return a LocalDate with the date in which the employee was hired.
	 * @since 0.1
	 */
	public LocalDate getHireDay() {
		return hireDay;
	}
	
	/**
	 * Method to raise the salary of the employee by some percentage.
	 * @param byPercent A double indicating the percentage with which the salary of the employee should be raised.
	 * @since 0.1
	 */
	public void raiseSalary(double byPercent)
	{
		double raise = this.salary * byPercent / 100;
		this.salary += raise;
	}

	@Override
	public int hashCode() 
	{
		return Objects.hash(hireDay, name, salary);
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(hireDay, other.hireDay) && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}

	@Override
	public String toString() {
		return "Employee [name = " + name + ", salary = " + salary + ", hireDay = " + hireDay + "]";
	}

	/**
	 * Implementation of method declared in the Comparable interface. It uses the salary of the Employee to compare instances of Employee.
	 * @param otherEmployee An Employee instance to be compared with the instance calling the method compareTo().
	 * @return a positive Integer if the instance calling the method has a higher salary than the other Employee; a negative Integer if the instance calling the method has a lower salary than the other Employee; a zero if both salaries are equals.
	 * @since 0.2 2022-03-09
	 */
	@Override
	public int compareTo(Employee otherEmployee) 
	{
		return Double.compare(this.salary, otherEmployee.salary);
	}	
	
}
