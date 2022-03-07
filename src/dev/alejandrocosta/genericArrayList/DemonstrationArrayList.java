package dev.alejandrocosta.genericArrayList;

import java.util.ArrayList;
import java.util.List;

import dev.alejandrocosta.model.Employee;

/**
 * This program demonstrates the use of the class ArrayList.
 * @author alejandro_costa
 * @version 0.1 2022-03-07
 */
public class DemonstrationArrayList {

	public static void main(String[] args) {
		
		//Declares and constructs an array list that holds Employee objects
		List<Employee> staff = new ArrayList<>();
		
		//Adds new elements to an array list
		staff.add(new Employee("Alejandro Costa", 55000d, 2022, 03, 07));
		staff.add(new Employee("Jana Ribeiro", 60000d, 2021, 07, 14));
		staff.add(new Employee("Wrong Entry", 22000, 2019, 02, 21));
		
		System.out.println("Size of the ArrayList: " + staff.size());
		System.out.println("First element of the ArrayList: " + staff.get(0));
		
		//Modifies or sets an element of the ArrayList
		staff.set(1, new Employee("Jana R Santana", 60000d, 2021, 07, 14));
		System.out.println(staff.get(1));
		
		//Removes an element
		staff.remove(2);
		
		//for each loop
		for (Employee employee : staff) System.out.println(employee);
		
		
	}

}
