package corejava;

import java.sql.SQLException;
import java.util.concurrent.CopyOnWriteArrayList;

public class BasicMethodOverLoadingQuestion {

	
	class A {
		
		public void method1(Object a) throws Exception{
			
			System.out.println("In Class A method1()");
			
			
		};
	}
	
	
   class B extends A {
	   
	   public void method1(Object b) throws SQLException {
		   System.out.println("In Class B method1(Obj)");
	   };
	   
	   public void method1(String b) {
		   System.out.println("In Class B method1(String)");
	   };
	   
//	   public void method1(Integer b) {
//		   System.out.println("In Class B method1(Integer)");
//	   };
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
		
		try {
			b.method1(new Object());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // -->In Class B method1(Obj)
		
		CopyOnWriteArrayList<String> list= new CopyOnWriteArrayList<String>();
		
		list.add("aa");
		list.add("bb");
		list.add(null);
		
		for (String el : list) {
			
			System.out.println(" " + el);
			list.add("cc");
			
		}
		
		b.method1(null); // -->In Class B method1(String)
		
		
		
   }
}
