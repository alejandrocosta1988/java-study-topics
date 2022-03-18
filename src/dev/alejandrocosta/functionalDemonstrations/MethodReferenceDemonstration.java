package dev.alejandrocosta.functionalDemonstrations;

import java.util.Arrays;

import dev.alejandrocosta.model.Employee;

/**
 * Demonstrates the use of Method Reference.
 * @author Alejandro Costa
 * @version 0.1 2022-03-18
 */
public class MethodReferenceDemonstration {

	public static void main(String[] args) {
		
		System.out.println("Creating an array of employees...");
		var staff = new Employee[3];
		staff[0] = new Employee("Alejandro Costa", 55000d, 2022, 03, 07);
		staff[1] = new Employee("Jana Ribeiro", 60000d, 2021, 07, 14);
		staff[2] = new Employee("Wrong Entry", 22000, 2019, 02, 21);
		System.out.println();
		
		System.out.println("Printing all the employees...");
		for (Employee employee : staff) System.out.println(employee);
		System.out.println();
		
		System.out.println("Sorting the employees using a method reference...");
		Arrays.sort(staff, Employee::compareTo);
		//Arrays.sort(staff, (employee1, employee2) -> employee1.compareTo(employee2));
		for (Employee employee : staff) System.out.println("Name: " + employee.getName() + ", Salary: " + employee.getSalary());
		
		
		
		
	}

}
