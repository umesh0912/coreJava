package corejava;

import java.util.function.BiFunction;

public class AddTwoNumbersUsingLamdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiFunction<Integer, Integer, Integer> add =  (t1,t2) -> t1+t2;
		
		System.out.print("Add number " + add.apply(4, 5));
	}

}
