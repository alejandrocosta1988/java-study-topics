package dev.alejandrocosta.InterfaceDemonstration;

import java.util.Arrays;

import dev.alejandrocosta.model.Employee;

/**
 * Demonstration of use of the interface Comparable. This program creates an array of Employee objects and sort it according to the salaries of the employees. The sort method of class Arrays uses the compareTo() method of the Comparable interface.
 * @author Alejandro Costa
 * @version 0.1 2022-03-11
 */
public class WithArraySorting 
{

	public static void main(String[] args) 
	{
		
		var staff = new Employee[3];
		
		staff[0] = new Employee("Alejandro Costa", 55000, 2022, 03, 10);
		staff[1] = new Employee("Jana R Santana", 75000, 2018, 06, 13);
		staff[2] = new Employee("Filipa Costa Ribeiro", 51000, 2022, 01, 19);
		
		Arrays.sort(staff);
		
		for (Employee employee : staff)
		{
			System.out.println("Name: " + employee.getName() + ". Salary: $" + employee.getSalary());
		}

	}

}
