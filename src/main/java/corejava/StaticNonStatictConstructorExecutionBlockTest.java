package corejava;

public class StaticNonStatictConstructorExecutionBlockTest {

	static {

		System.out.println("static block loaded");
	}

	{

		System.out.println("non static block loaded");
	}

	public StaticNonStatictConstructorExecutionBlockTest() {
		System.out.println("Constructor is loaded");
	}

	public static void main(String[] args) {

		System.out.println("In FrequencyMapTest");
		StaticNonStatictConstructorExecutionBlockTest block = new StaticNonStatictConstructorExecutionBlockTest();
	}

}
