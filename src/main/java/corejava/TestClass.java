package corejava;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] inputArray = { 1, 3, 4, 3, 5, 2, 3, 6, 7, 1, 4, 6, 8, 9, 11, 3, 4 };
		
		int no1=4, no2=5;
		Sum sum = (n1,n2) -> n1+n2;
		System.out.println("Addition: " + sum.sum(no1, no2));

		int mx = Integer.MIN_VALUE;

		// for(int i=0;i< inputArray.length;i++ ) { // ---> return max number as 11

		for (int i : inputArray) { // ---> return max number as 11

			if (mx <= inputArray[i]) {
				// System.out.print(i+" ");
				mx = inputArray[i];
			}
		}

		System.out.println("max element --> " + mx);

		// frequency of each array element;

		List<Integer> list = Arrays.asList(inputArray);

		Map<Object, Long> freqMap = list.stream()
				.collect(Collectors.groupingBy(l -> l.toString(), Collectors.counting()));

//		Map<Integer, Integer> freqMap = new HashMap<>();
//
//		for (Integer i : list) {
//
//			if (freqMap.containsKey(i)) {
//				freqMap.put(i, freqMap.get(i) + 1);
//			} else {
//				freqMap.put(i, 1);
//			}
//		}
//		
		// freqMap.forEach((k,v) -> {System.out.println("K " + k + " ,V " + v);});
		
		int number =123445454, count=0;
		
		while (number%10>0) {

			  number = number/10;
			  count++;
			}
        
		System.out.println(count);
		
		String str="umesh";
		
	    System.out.println(str.substring(2,4));
	    
	    

		int arr[]={8, 9, 0, 1, 2, 0, 3};
		int temp;
		int num = 0;
		int counter=0;
		

		for(int i=0;i< arr.length;i++) {
				
				if(arr[i]!=num) {
					temp=arr[counter];
					arr[counter]=arr[i];
					arr[i]=temp;
					counter= counter+ 1;
							
				}
			
		}
		System.out.println("");
		for(int i=0;i< arr.length;i++) {
		System.out.print(" "+arr[i]);}
		
		Arrays.sort(arr);

		System.out.println("");
		for(int i=0;i< arr.length;i++) {
		System.out.print(" "+arr[i]);}

	}
	


}
