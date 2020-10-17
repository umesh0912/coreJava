package corejava;

// Interesting 
 interface simple {
	
	  default void calculate () {
		 System.out.println("in simple");
	 }
	 
}
 
 interface simple1 {
		
	  default void calculate () {
		 System.out.println("in simple");
	 }
	
}
 
 interface simp extends simple,simple1 {

	//Keep this in mind always
	 @Override
	default void calculate() {
		// TODO Auto-generated method stub
		simple.super.calculate();
	}
		
	
}
public class InterfaceTest {

}

class interfaceImpl implements simple, simple1 {

	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		simple.super.calculate();
	}

	//Duplicate default methods named calculate with the parameters () and () are inherited from the types simple1 and simple
	// if we don't override we will get above compilation error
	
}
