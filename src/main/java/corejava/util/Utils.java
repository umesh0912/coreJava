package corejava.util;

import java.util.Arrays;
import java.util.List;

import corejava.model.Person;

public class Utils {
	
	
	public static List<Person> getPersonsList () {
		
		List<Person> p= Arrays.asList(
				new Person("Umesh", "Jadhav", 29),
				new Person("Puja", "Jadhav", 23),
				new Person("Piyush", "Jadhav", 1),
				new Person("Shashank", "bambole", 30),
				new Person("Shashank", "dubey", 28),
				new Person("Surjeet", "karmakar", 28),
				new Person("Shubhdip", "maity", 29),
				new Person("Navnath", "hande", 29),
				new Person("abc", "pqr", 29),
				new Person("mnp", "xyz", 29)
				);
		
		return p;
	}

}
