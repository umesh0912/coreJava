package corejava;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
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
		
		System.out.println("Sum --> "+ sum);
		
		System.out.println("count --> "+ totalCount);
		
		System.out.println("max --> "+ max.getAsInt());
		
		System.out.println("min --> "+ min.getAsInt());
		
		
		System.out.println("avg --> "+ avg.getAsDouble());
		
				    
	}

}
