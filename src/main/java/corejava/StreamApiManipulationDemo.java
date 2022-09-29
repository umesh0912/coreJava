package corejava;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class StreamApiManipulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		Optional<Integer> optional = list.stream().filter(n -> n ==5).findAny();
		
		System.out.println(" 5 is available in list --> " + optional.isPresent());
		
		Integer isValueAvailable = list.stream().filter(n -> n==10).findAny().orElse(null);
		
		if (isValueAvailable !=  null)
			System.out.println("is 10 availabe in list " + isValueAvailable);
		
		Integer sum = list.stream()
				      .filter(n -> n> 5)				     
				      //.reduce(0, Integer::sum); // reduce(0, (a,b) -> a+b);
				      //.collect(Collectors.summingInt(Integer::intValue));
				      .mapToInt(Integer::intValue)
				      .sum();
		
		long totalCount = list.stream()
					 .mapToInt(Integer::intValue)
					 .count();
		
		OptionalInt max = list.stream()
				 .mapToInt(Integer::intValue)
				 .max();
		
		OptionalInt min = list.stream()
				 .mapToInt(Integer::intValue)
				 .min();
		
		OptionalDouble avg = list.stream()
				 .mapToInt(Integer::intValue)
				 .average();
		
		System.out.println("FunctionalIntefaceTest --> "+ sum);
		
		System.out.println("count --> "+ totalCount);
		
		System.out.println("max --> "+ max.getAsInt());
		
		System.out.println("min --> "+ min.getAsInt());
		
		
		System.out.println("avg --> "+ avg.getAsDouble());
		
				    
	}

}

/*
    o/p:
    FunctionalIntefaceTest --> 40
	count --> 10
	max --> 10
	min --> 1
	avg --> 5.5
*/
