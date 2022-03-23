package dev.alejandrocosta.model;

import java.util.Objects;

/**
 * Class Person holds only the name of a person. This class was created not to be a superclass. It was created just to be used in the demonstration of Constructor Reference.
 * @author Alejandro Costa
 * @version 0.1 2022-03-23
 */
public class Person {

	private String name;
	
	public Person() {
		
	}
	
	public Person(String name) {
		this.name = name;	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name = " + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(name, other.name);
	}
	
}
