package corejava;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
class Person {

	String name;

	public Person(String name) {

		this.name = name;
	}
}

public class EqualsAndHashcodeForCustomeObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("ABC");
		Person p2 = new Person("ABC");

		System.out.println(p1.equals(p2));
		System.out.println(p1 == p2);
	}

}


/*
    OutPut: without overriding equals method
    false
	false
	
	OutPut:  overriding equals method
    true
	false
 
 */
