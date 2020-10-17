package corejava.model;

import lombok.Data;

@Data
public class Person {

	public String fName;
	public String lName;
	public int age;
	
	public Person () {
		
	}

	public Person(String string, String string2, int i) {
		this.fName=string;
		this.lName=string2;
		this.age=i;
	}
}
