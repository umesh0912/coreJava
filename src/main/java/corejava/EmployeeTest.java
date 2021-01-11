package corejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.empId * 73;
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

public class EmployeeTest {

	public static void main(String[] args) {

		List<Employee> list1 = new ArrayList<>();
		list1.add(new Employee(1, "ABC"));
		list1.add(new Employee(2, "xyz"));
		list1.add(new Employee(3, "mnp"));

		List<Employee> list2 = new ArrayList<>();
		list2.add(new Employee(1, "ABC"));
		list2.add(new Employee(2, "xyz"));
		list2.add(new Employee(3, "mnp"));

		Set<Employee> allEmps = new HashSet<>();

		allEmps.addAll(list1);
		allEmps.addAll(list2);

		Boolean isEqual = true;

		if (allEmps.size() == (list2.size() + list1.size()))
			isEqual = false;

		System.out.println("Are two lists are same--> " + list1.equals(list2));

		System.out.println("Are two lists are same--> " + list1.containsAll(list2));

		// System.out.println("Are two lists are same--> " + );

		list1.forEach((e -> {
			Boolean flag = list2.stream().anyMatch(e2 -> e.equals(e2));
			System.out.println(flag);
		}));

		int[] arr = { 2, 5, 7, 6, 3, 9 };
		
		//Arrays.sort(arr);
		int  target=10;
		
		System.out.println("close to "+ target+ "--> " + findClosest(arr, target));
	
	}
	
	public static int findClosest(int[] input, int target) {
		
		if (input[0]==target)
			return target;
		
		int i = 0;
		int j = input.length;
		
		while(i < j){
			int mid = (i + j)/2;
			
			if(input[mid] == target)
				return target;
			
			if(target < input[mid]){
				if(target > input[mid-1]){
					return getClosest(input[mid-1], input[mid], target);
				}
				j = mid;
			}else if(target > input[mid]){
				if(target < input[mid+1]){
					return getClosest(input[mid], input[mid + 1], target);
				}
				i = mid + 1;
			}
		}
		return 0;
		
	}
	
	public static int getClosest(int value1,int value2, int target){
		if(target - value1 >= value2 - target){
			return value2;
		}else{
			return value1;
		}
	}

}
