package corejava;

import java.util.function.Consumer;


class Person {
	
	String name;
	
	public Person(String name) {
		
		this.name=name;
	}
}
public class ExecutionBlocks {

	static {

		System.out.println("static block loaded");
	}

	{

		System.out.println("non static block loaded");
	}

	public ExecutionBlocks() {
		System.out.println("Constructor is loaded");
	}

	
	public  static void main(String[] args) {
		
		System.out.println("In Main");
		ExecutionBlocks block = new ExecutionBlocks();
		
		Consumer<String> print = s -> System.out.println(s);
		print.accept("Umesh");
		
		Person p1= new Person("ABC");
		Person p2= new Person("ABC");
		
		System.out.println(p1.equals(p2));
		System.out.println(p1==p2);
	}
	
}
