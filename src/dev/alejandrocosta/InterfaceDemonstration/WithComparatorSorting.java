package dev.alejandrocosta.InterfaceDemonstration;

import java.util.Arrays;

import dev.alejandrocosta.model.Employee;
import dev.alejandrocosta.model.EmployeeLengthComparator;

/**
 * Uses a comparator to compare employees instances. This class demonstrates the use of the Comparator interface.
 * @author Alejandro Costa
 * @since 2022-03-15
 */
public class WithComparatorSorting {

	public static void main(String[] args) {
		
		var staff = new Employee[3];
		
		staff[0] = new Employee("Alejandro Costa", 55000, 2022, 03, 10);
		staff[1] = new Employee("Jana R Santana", 75000, 2018, 06, 13);
		staff[2] = new Employee("Filipa Costa Ribeiro", 51000, 2022, 01, 19);
		
		var comparator = new EmployeeLengthComparator();
		
		System.out.println("Before sorting: ");
		for (Employee employee : staff)
		{
			System.out.println("Name: " + employee.getName());
		}
		
		Arrays.sort(staff, comparator);
		
		System.out.println("After sorting: ");
		for (Employee employee : staff)
		{
			System.out.println("Name: " + employee.getName());
		}
		
	}
	
}
