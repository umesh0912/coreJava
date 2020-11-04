package corejava;


class A {
	
	static {
		System.out.print(" In Stataic bloack of class A");
	}
}
public class StaticCheck {

	A a = new A();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println(" In Main");
	}
	
	static {
		
		System.out.println(" In Stataic bloack of class StaticCheck");
	}

}
//O/P

//In Stataic bloack of class StaticCheck
//In Main