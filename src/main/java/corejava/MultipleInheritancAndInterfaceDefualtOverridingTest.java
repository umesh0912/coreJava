package corejava;

// Interesting 
interface Parent1 {

	public void print();

	default void calculate() {
		System.out.println("in Parent1 interface default method");
	}

}

interface Parent2 {

	public void print();

	default void calculate() {
		System.out.println("in Parent2 interface default method");
	}

}

interface ChildIntefaceExtendingParent1AndParent2 extends Parent1, Parent2 {

	// Keep this in mind always
	/**
	 * This is important, if we do not override the calculate method then it will
	 * give compilation error with below message,
	 * Duplicate default methods named
	 * calculate with the parameters () and () are inherited from the types Parent2
	 * and Parent1
	 */
	default void calculate() {
		// TODO Auto-generated method stub

		System.out.println("In ChildIntefaceExtendingParent1AndParent2 interface default method");
		Parent1.super.calculate(); // this will call Parent1 default method
		Parent2.super.calculate(); // this will call Parent2 default method
	}
	
	public void print();

}

/**
 * This very interesting
 * @author umesh
 *
 */
abstract class AbstractParentClass {

	abstract void print();

}

interface ParentInterface {

	void print();
}

class ChildCLassMultipleInheritanceTest extends AbstractParentClass implements ParentInterface {

	@Override
	public void print() {
		System.out.println("In ChildCLassMultipleInheritanceTest print()");
	}

}

class ChildClassImplementingChildInterface implements ChildIntefaceExtendingParent1AndParent2 {

	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		System.out.println("in ChildClassImplementingChildInterface calculate() ");
		ChildIntefaceExtendingParent1AndParent2.super.calculate();
	}

	@Override
	public void print() {
		System.out.println("in ChildClassImplementingChildInterface print() ");

	}

}

public class MultipleInheritancAndInterfaceDefualtOverridingTest {

	public static void main(String[] args) {

		ChildIntefaceExtendingParent1AndParent2 sim = new ChildClassImplementingChildInterface();
		sim.calculate();
		sim.print();
		
		ChildCLassMultipleInheritanceTest test = new ChildCLassMultipleInheritanceTest();
		test.print(); // In ChildCLassMultipleInheritanceTest print()
		
		AbstractParentClass test2 = new ChildCLassMultipleInheritanceTest();
		test2.print(); // In ChildCLassMultipleInheritanceTest print()

	}
}

/* 
    Output:
        in ChildClassImplementingChildInterface calculate() 
		In ChildIntefaceExtendingParent1AndParent2 interface default method
		in Parent1 interface default method
		in Parent2 interface default method
		in ChildClassImplementingChildInterface print() 
		In ChildCLassMultipleInheritanceTest print()
		In ChildCLassMultipleInheritanceTest print()
 */


