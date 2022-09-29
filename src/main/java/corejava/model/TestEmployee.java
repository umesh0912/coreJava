package corejava.model;

import java.util.HashSet;
import java.util.Set;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp = new Employee("1", "Umeshdadad");
		
		Employee emp2 = new Employee("1", "Umeshdadasd");
		
		System.out.println("are both object are equal --> " + emp.equals(emp2));
		
		System.out.println("are both object's hashcode are equal --> " + emp.hashCode()  + " " + emp2.hashCode());
		
		Set<Employee> set = new HashSet();
		
		set.add(emp);
		set.add(emp2);
		
		System.out.println("size of set --> " + set.size());

	}

}
