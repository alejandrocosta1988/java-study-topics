package dev.alejandrocosta.model;

import java.util.Comparator;

/**
 * Implements a comparator for Employees which use the length of the employee's name to make the comparison.
 * @author Alejandro Costa
 * @since 2022-03-15
 */
public class EmployeeLengthComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee employee, Employee employeeOther) {
		
		String employeeName = employee.getName();
		String employeeOtherName = employeeOther.getName();
		
		return employeeName.length() - employeeOtherName.length();
		
	}

}
