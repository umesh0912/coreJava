package corejava;

import java.sql.SQLException;
import java.util.concurrent.CopyOnWriteArrayList;

public class BasicMethodOverLoadingQuestion {

	/*
	 * Exception scenarios in overloading and overriding methods
	 * 
	 * For method overloading no need to worry. any exception can be thrown by overloaded method
	 * 
	 * But for Overriding method following conditions need to be checked,
	 * 
	 * 1) checked exception:
	 * --> We can reduce or eliminate the exception of an overridden method but exception must not be new
	 * 
	 * for example:-
	 *  1) if parent class method throwing EOFException and child class overridden method throws IOException then we will get compile time error
	 *    --> bcs IOException is superclass of EOFException
	 *    
	 *  2) if parent class method not throwing any exception and child class overridden method throws IOEception/EOFException then also we get compile tine error
	 *  
	 * 2) for unchecked exceptions,
	 *   This type of exception can appeared anywhere in the program
	 *  
	 * 
	 */
	class A {
		
		public void method1(Object a) throws Exception{
			
			System.out.println("In Class A method1()");
			
			
		};
	}
	
	
   class B extends A {
	   
	   public void method1(Object b) throws SQLException {
		   System.out.println("In Class B method1(Obj)");
	   };

	   
	   //never gets called as method1(Obj) is available
	   public void method1(String b) {
		   System.out.println("In Class B method1(String)");
	   };
	   
	   public void method1(Integer b) {
		   System.out.println("In Class B method1(Integer)");
	   };
   }
   
   public  int Add (int a, int b) {
	   System.out.println("In primitivem primitive");
	   return a+b;
   }
   
   public  int Add (Integer a, int b) {
	   System.out.println("In wrapper primitive");
	   return a+b;
   }
   
   
   public static void main(String[] args) throws Exception {
	//	new BasicMethodOverLoadingQuestion().Add(new Integer(10),10);
		// will print In wrapper, primitive
		// and new BasicMethodOverLoadingQuestion().Add(10,10)
		// will print In primitive, primitive
		
		A b = new BasicMethodOverLoadingQuestion ().new B();
		
		/*
		 *  V.I.M.P note 
		   
			1)  A b = new BasicMethodOverLoadingQuestion ().new B();
			   
			    Reference is of parent class and object is of child class so  parent class method1 get called
			    and if that method1 is overridden in child class then that will be called
			   
			    if we called following methods on b object
			    
			    	b.method1(new Object());
			    	b.method1(null);
					b.method1("Hi");
					b.method1(new String("Hi"));
					b.method1(new Integer(1));
					b.method1(1);
					
								   
			   then  o/p:
			    
					In Class B method1(Obj)
					In Class B method1(Obj)
					In Class B method1(Obj)
					In Class B method1(Obj)
					In Class B method1(Obj)
					In Class B method1(Obj)
					
			Note if we remove overridden method from clss B then we get following o/p
			 		
					In Class A method1()
					In Class A method1()
					In Class A method1()
					In Class A method1()
					In Class A method1()
					In Class A method1()
					
			2)  B b = new BasicMethodOverLoadingQuestion ().new B();
			 
			    in class B there are method1(String) and method1(Integer) And Method(Object)  are available 
			    
			     so,  b.method1(null) throws compilation error because 
			     Integer , Object and String can be null so there will be ambiguty so compilation fails
			   
			    if we called following methods on b object
			    
			    	b.method1(new Object());
			    	//	b.method1(null); // fails if b is reference of B
					b.method1("Hi");
					b.method1(new String("Hi"));
					b.method1(new Integer(1));
					b.method1(1);
					
			   theen o/p:
			   
				In Class B method1(Obj)
				In Class B method1(String)
				In Class B method1(String)
				In Class B method1(Integer)
				In Class B method1(Integer)

		 */
		try {
			b.method1(new Object());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // -->In Class B method1(Obj)
		
//		CopyOnWriteArrayList<String> list= new CopyOnWriteArrayList<String>();
//		
//		list.add("aa");
//		list.add("bb");
//		list.add(null);
//		
//		for (String el : list) {
//			
//			System.out.println(" " + el);
//			list.add("cc");
//			
//		}
		
		b.method1(null); // -->In Class B method1(Obj) // failes if b is reference of B
		b.method1("Hi");//  -->In Class B method1(Obj)
		b.method1(new String("Hi"));//  -->In Class B method1(Obj)
		b.method1(new Integer(1)); //In Class B method1(Obj)
		b.method1(1); //In Class B method1(Obj)
		
		
   }
}
