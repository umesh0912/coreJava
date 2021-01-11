package corejava;

// Interesting 
 interface simple {
	
	 public void print();
	  default void calculate () {
		 System.out.println("in simple");
	 }
	 
} 
 interface simple1 {
		
	 public void print();
	  default void calculate () {
		 System.out.println("in simple");
	 }
	
}
 
 interface simp extends simple,simple1 {

	//Keep this in mind always
	 default void calculate() {
		// TODO Auto-generated method stub
		 
	System.out.println("In simp interface");
	//	simple.super.calculate();
	}
	 


	 abstract class absimple {
			
		  abstract void print ();
		 
	} 
	 
	 interface  ifsimple {
			
		   void print ();
	}
	 
	 
  class InterfaceAbstractTest extends absimple implements ifsimple{

	@Override
	
	public void print() {
		System.out.println("Hi");
		
	}
	  
  }
		
	
}
public class InterfaceTest {
	
	public static void main(String[] args) {
		
		simp sim = new interfaceImpl();
		sim.calculate();
		sim.print();
		
	}

}

class interfaceImpl implements simp {

//	@Override
//	public void calculate() {
//		// TODO Auto-generated method stub
//		//simple.super.calculate();
//		
//		System.out.println("in calculate calculate ");
//	}

	@Override
	public void print() {
		System.out.println("in interfaceImpl print ");
		
	}

	//Duplicate default methods named calculate with the parameters () and () are inherited from the types simple1 and simple
	// if we don't override we will get above compilation error
	
}
