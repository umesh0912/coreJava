package corejava;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import corejava.model.Person;
import corejava.util.Utils;

public class SortingUsingOldWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Person> p = Utils.getPersonsList();

		Comparator<Person> sortByAge = new Comparator<Person>() {

			public int compare(Person o1, Person o2) {
				if (o1.getAge() > o2.getAge())
					return 1;
				else if (o1.getAge() < o2.getAge())
					return -1;
				else
					return 0;
			}

		};

		Collections.sort(p, sortByAge);

		p.forEach(System.out::println);

	}
}
