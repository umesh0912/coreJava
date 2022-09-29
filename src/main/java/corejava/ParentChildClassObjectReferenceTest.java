package corejava;

public class ParentChildClassObjectReferenceTest {

	public class A {
		public  String getValObj() {
			return "A";
		};
		
		public String parent() {
			return "parent method";
		}
	}

	public class B extends A {

		public  String getValObj() {
			return "B";
		};
		
		public String child() {
			return "child method";
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ParentChildClassObjectReferenceTest outer = new ParentChildClassObjectReferenceTest();
		A a = outer.new A();
		System.out.println("A-A val : " + a.getValObj()); // A
		A a1 = outer.new B();
		System.out.println("A-B val : " + a1.getValObj()); // B
		//B b = outer.new A();      // Type mismatch: cannot convert from ParentChildClassObjectReferenceTest.A to ParentChildClassObjectReferenceTest.B
		//B b1 = (B) outer.new A(); // java.lang.ClassCastException: corejava.ParentChildClassObjectReferenceTest$A cannot be cast to corejava.ParentChildClassObjectReferenceTest$B
								    // at corejava.ParentChildClassObjectReferenceTest.main(ParentChildClassObjectReferenceTest.java:27)
		// System.out.println("B-A val : " + b1.getValObj());
		B b = outer.new B();
		System.out.println("B-B val : " + b.getValObj()); // B
		
		System.out.println("call parent class method using B-B scenario: " + b.parent());
		//System.out.println("call child class  method using A-A scenario: " + a.child()); //The method child() is undefined for the type ParentChildClassObjectReferenceTest.A
		
		// following case is interesting 
		//System.out.println("call child class  method using A-B scenario: " + a1.child()); // The method child() is undefined for the type ParentChildClassObjectReferenceTest.A
		
	}

}

/*
 *  Output: 
	A-A val : A
	A-B val : B
	B-B val : B
	call parent class method using B-B scenario: parent method


 */
