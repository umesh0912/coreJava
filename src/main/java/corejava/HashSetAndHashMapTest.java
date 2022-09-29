package corejava;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashSetAndHashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Set<String> s = new  HashSet<>();
		
		Map<String, Integer> map = new HashMap<>();
		
		System.out.println("Map put return type --> " + map.put("one", 1));
		
		System.out.println("Map put return type --> " + map.put("one", 2));
		 
		s.add("Umesh");
		s.add("puja");
		s.add(new String("Umesh"));
		
		System.out.println("size--> "+ s.size());
		
		s.forEach(System.out::println);
		
		System.err.println("73 is prime ->" + isPrimeNumber(73));
	}
	
	
	static boolean isPrimeNumber (int n) {
		
		int primestart=2;
		
		while (n%primestart != 0) {
			
			primestart++;
		}
		
		if (n == primestart)
			return true;
		
		return false;
	}

}

/*
    OutPut:
	    Map put return type --> null
		Map put return type --> 1
		size--> 2
		Umesh
		puja 
 */
