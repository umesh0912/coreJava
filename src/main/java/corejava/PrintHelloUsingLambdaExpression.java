package corejava;

import java.util.function.Consumer;

public class PrintHelloUsingLambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Consumer<String> sayHello = (r) -> System.out.println(r);

		sayHello.accept("umesh");
	}

}
