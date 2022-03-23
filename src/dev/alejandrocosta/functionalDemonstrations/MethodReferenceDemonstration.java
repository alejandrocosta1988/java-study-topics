package dev.alejandrocosta.functionalDemonstrations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import dev.alejandrocosta.model.Employee;
import dev.alejandrocosta.model.Person;

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
		System.out.println();
		
		System.out.println("Demonstration of the use of Constructor Reference...");
		System.out.println("Creating an array of names...");
		ArrayList<String> names = new ArrayList(Arrays.asList("Maria", "João", "Filipa", "Gustavo"));
		Stream<Person> stream = names.stream().map(Person::new); //Constructor reference
		List<Person> people = stream.collect(Collectors.toList());
		for (Person person : people) System.out.println(person.toString());
		
	}

}
