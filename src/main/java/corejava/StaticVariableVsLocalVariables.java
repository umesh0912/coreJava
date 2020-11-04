package corejava;

public class StaticVariableVsLocalVariables {

	private static Integer i = 2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		i = 1; // This will change value of static variable i declare above
		int j = i;

		if (i == j)
			System.out.println(" i==j --> true");
		else
			System.out.println(" i==j --> false");

		if (StaticVariableVsLocalVariables.i == j)
			System.out.println(" StaticVariableVsLocalVariables.i==j --> true");
		else
			System.out.println(" i==j --> false");
		
		System.out.println("value of StaticVariableVsLocalVariables.i -->" + StaticVariableVsLocalVariables.i);
	}

}
