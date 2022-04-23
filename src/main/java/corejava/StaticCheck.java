package corejava;


class A {
	
	static {
		System.out.println(" In Stataic bloack of class A");
	}
	
	public void printTest() {
		System.out.println("print from class A");
	}
}
public class StaticCheck {

	A b = new A(); // this will not print class A static block
    static A a = new A();// this will print class A static block
    /**
     * If we declare "a" variable as static then static block of class will get executed.
     * keep this in mind it's very important
     * @param args
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	A a = new A();// this will print class A static block
		System.out.println(" In Main");
		a.printTest();
	}
	
	static {
		
		System.out.println(" In Stataic bloack of class StaticCheck");
	}

}
//O/P

//In Stataic bloack of class A
//In Stataic bloack of class StaticCheck
//In Main
