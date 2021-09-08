package corejava;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestinMapApisInJava8 {
	
	static Map<String, Integer> map = new HashMap();
	
	static List<String> list= Arrays.asList(
			"one", "two", "three", "four",
			"two", "three", "five", "four",
			"seven", "two", "three", "six"
			);
	
	static 
	{
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		map.put("four", 4);
		map.put("five", 5);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("All entries of map --> " + map.entrySet());
		
		//get content of map using old way
		//itrateOverMapInJava ();
	
		//get content of map using new way	
	    //iterateOverMapUsingJava8();
		
		printFreqMap();

	}
	
	public static void itrateOverMapInJava () {
		
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			
			System.out.println("Key --> "+ entry.getKey() + "    value --> " + entry.getValue());
		}
		
		/*
		 * OUTPUT:
		 * Key --> four value --> 4
		 * Key --> one value --> 1
		 * Key --> two value --> 2 
		 * Key--> three value --> 3
		 * Key --> five value --> 5
		 */
	}
	
	public static void iterateOverMapUsingJava8() {
		
		map.forEach((k,v) -> {System.out.println("Key --> "+ k + "    value --> " + v);});
		
		/*
		 * OUTPUT:
		 *  Key --> four    value --> 4
			Key --> one    value --> 1
			Key --> two    value --> 2
			Key --> three    value --> 3
			Key --> five    value --> 5
		 * 
		 */
	}

	
	public static void printFreqMap () {
		
		Map<Object, Long> freqMap = list.stream()
										.collect(
													Collectors.groupingBy(l -> l.toString(), Collectors.counting())
												);
		
		freqMap.forEach((k,v) -> {System.out.println("Key --> "+ k + "    value --> " + v);});
		
		/*
		 * OUTPUT:
		 * 
		 *  Key --> six    value --> 1
			Key --> four    value --> 2
			Key --> one    value --> 1
			Key --> seven    value --> 1
			Key --> five    value --> 1
			Key --> three    value --> 3
			Key --> two    value --> 3

		 */
	}
}
