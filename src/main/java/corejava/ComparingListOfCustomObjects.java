package corejava;

import java.util.ArrayList;
import java.util.List;

class Employee {

	Integer empId;
	String eName;

	Employee(Integer empId, String eName) {

		this.empId = empId;
		this.eName = eName;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	@Override
	public boolean equals(Object obj) {
		Employee emp = (Employee) obj;

		if (emp == null)
			return false;

		if (emp.empId == this.empId && emp.eName.equals(this.eName))
			return true;

		return false;
	}
}

public class ComparingListOfCustomObjects {

	public static void main(String[] args) {

		List<Employee> list1 = new ArrayList<>();
		list1.add(new Employee(1, "ABC"));
		list1.add(new Employee(2, "xyz"));
		list1.add(new Employee(3, "mnp"));

		List<Employee> list2 = new ArrayList<>();
		list2.add(new Employee(1, "ABC"));
		list2.add(new Employee(2, "xyz"));
		list2.add(new Employee(3, "mnp"));

		System.out.println("Are two lists are same using equals method--> " + list1.equals(list2));

		System.out.println("Are two lists are same using containsAll method--> " + list1.containsAll(list2));

	}

}

/*
    Case 1: overriding equals method 
    Output: 
    Are two lists are same using equals method--> true
	Are two lists are same using containsAll method--> true
	
	Case 1: not overriding equals method 
    Output: 
    Are two lists are same using equals method--> false
	Are two lists are same using containsAll method--> false

 */
