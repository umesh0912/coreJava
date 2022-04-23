package corejava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import corejava.model.Person;
import corejava.util.Utils;

public class SortingUsingNewLambdaWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Person> p = Utils.getPersonsList();
		
		System.out.println("Before sorting ");
		p.forEach(System.out::println);
//		Comparator<Person> sortByAge = new Comparator<Person>() {
//
//			public int compare(Person o1, Person o2) {
//				if (o1.getAge() > o2.getAge())
//					return 1;
//				else if (o1.getAge() < o2.getAge())
//					return -1;
//				else
//					return 0;
//			}
//
//		};
//
//		Collections.sort(p, sortByAge);

		//p.sort((p1,p2)-> p1.getFName().compareTo(p2.getFName()));
		
		//Sort in ASCH order
		p.sort(Comparator.comparingInt(Person::getAge).thenComparing(Person::getFName));
		
		//sp.sort(Comparator.comparing(Person::getFName));
		
		//ReversedOrder
		//p.sort(Comparator.comparingInt(Person::getAge).reversed());
		
		System.out.println("Before sorting ");
		//p.sort(Comparator.reverseOrder()));
		p.forEach(System.out::println);
		
		// #imp
		List<String> str = new ArrayList();
		
		str.add("20");
		str.add("5");
		str.add("8");
		
		//Collections.sort(str); // no impact
		
		str.sort((p1,p2)-> p1.compareTo(p2));// no impact
		
		str.stream().forEach(System.out::println);

	}
}
