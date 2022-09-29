package corejava;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;

import corejava.model.Person;
import corejava.util.Utils;

public class TreeSetAndTreeMap {

	public static void main(String[] args) {
		System.out.println("Testing treeset and treeMap");

		forInbuildClassses();

		//forCustomeClassses();
		
		List<Person> pList = Utils.getPersonsList();
		
		//how to get how many person are there of same age
		
		Map<Integer, Long> freqMap = pList.stream()
								  .collect(Collectors.groupingBy(Person::getAge, Collectors.counting()));
		
		freqMap.forEach((k,v) -> {System.out.println("key-->"+k+" Value-->"+v);});
		
		
	}

	public static void forInbuildClassses() {
		List<Integer> listInteger = Arrays.asList(1, 2, 5, 2, 4, 8, 43);

		
		TreeSet<Integer> intTs = new TreeSet<>(Comparator.comparingInt(Integer::intValue));

		intTs.addAll(listInteger);
		
		//NavigableSet nset = intTs.descendingSet(); // awesome to reversed stuff.. added in 1.6 but we used java 1.8
		
		//TreeSet<Integer> intTs = new TreeSet<>(Comparator.comparingInt(Integer::intValue).reversed());

		//nset.forEach(System.out::println);

		intTs.forEach(System.out::println);
		
		/**
		  Output
		    1
			2
			4
			5
			8
			43

		 */
		
	}

	public static void forCustomeClassses() {
		List<Person> pList = Utils.getPersonsList();

		pList.forEach(System.out::println);
		
		/*
		 This is a very Imp step.. for custome classes
		 we must pass comparator otherwise at runtime we will get runtime exception
		 Exception in thread "main" java.lang.ClassCastException: class corejava.model.Person 
		 cannot be cast to class java.lang.Comparable (corejava.model.Person is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
		*/
		TreeSet<Person> pSet = new TreeSet<Person>(Comparator.comparing(Person::getAge));
		
		// to print in reversed then use following syntax
		//TreeSet<Person> pSet = new TreeSet<Person>(Comparator.comparing(Person::getAge).reversed());
		
		pSet.addAll(pList); // This add all list elements to set. Note that duplicate record will not get inserted
		
		Comparator comp = pSet.comparator();
		
		System.out.println("------------------Using TreeSet comp ---------------> " + comp);
		
		pSet.forEach(System.out::println);
		
		/*
		  	This will be the output
		  	
		    Testing treeset and treeMap
			Person(fName=Umesh, lName=Jadhav, age=29)
			Person(fName=Puja, lName=Jadhav, age=23)
			Person(fName=Piyush, lName=Jadhav, age=1)
			Person(fName=Shashank, lName=bambole, age=30)
			Person(fName=Shashank, lName=dubey, age=28)
			Person(fName=Surjeet, lName=karmakar, age=28)
			Person(fName=Shubhdip, lName=maity, age=29)
			Person(fName=Navnath, lName=hande, age=29)
			Person(fName=abc, lName=pqr, age=29)
			Person(fName=mnp, lName=xyz, age=29)
			------------------Using TreeSet comp ---------------> java.util.Comparator$$Lambda$3/0x0000000800b92440@5b2133b1
			Person(fName=Piyush, lName=Jadhav, age=1)
			Person(fName=Puja, lName=Jadhav, age=23)
			Person(fName=Shashank, lName=dubey, age=28)
			Person(fName=Umesh, lName=Jadhav, age=29)
			Person(fName=Shashank, lName=bambole, age=30)

		 */
		
	}
}
