package com.tylerpedersen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionsExample {

	public static void main(String[] args) {
		
		Person p1 = new Person("Jon", "Doe");
		Person p2 = new Person("Jane", "Doe");
		Person p3 = new Person("Jim", "Doe");
		Person p4 = new Person("Nacy", "Doe");
		Person p5 = new Person("Beth", "Doe");
		
		Collection<Person> persons = new ArrayList<>();
		
		// Try out some operations
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		persons.add(p4);
		
		System.out.println("isEmpty: " + persons.isEmpty());
		System.out.println("size: " + persons.size());
		System.out.println("persons contains p4: " + persons.contains(p4));
		System.out.println("persons contains p5: " + persons.contains(p5));
		
		persons.remove(p1);
		
		persons.stream().forEach( System.out::println );
		
		// Convert to an Array
		Person[] personsArray = new Person[persons.size()];
		personsArray = persons.toArray(personsArray);
		
		System.out.println(Arrays.toString(personsArray));
		
	}
}
