package corejava;

public class AutoBoxingUnBoxingWideningScenarios {

	
	public void go(int i) {
		System.out.println("int");
	}
	
	public void go(Integer i) { // this will not gets call as go (int i ) is available
		System.out.println("int");
	}
	
	public void go(long l) {
		System.out.println("long");
	}
	
	public void go(float f) {
		System.out.println("float");
	}
	
	public void go(double i) {
		System.out.println("double");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * What is widening?
		 * 
		 * automatic conversion of primitives to other upper level primitives type
		 * 
		 * byte --> short --> int --> long --> float -->double
		 * 
		 * What is Autoboxing?
		 * automatic conversion of primitive type to wrapper class
		 * 
		 * what is Unboxing?
		 * same as above just wrapper to primitive
		 * 
		 * Note:
		 * Widening beats autoboxing --> wait for examples to clear this :)
		 * 
		 */
		
		int i=5;
		byte b=6;
		short s=7;
		long l=5;
		float f=5.0f;
		double d=3.0;
		
		Integer iw=i;
		
		AutoBoxingUnBoxingWideningScenarios test = new AutoBoxingUnBoxingWideningScenarios();
		
		test.go(i); // o/p:- int
		test.go(b); // o/p:- int
		test.go(s); // o/p:- int
		
		test.go(l); // o/p:- long
		test.go(iw); // o/p:- int  --> Widening beats autoboxing
	}

}
