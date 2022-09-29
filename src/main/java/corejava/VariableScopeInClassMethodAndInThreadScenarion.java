package corejava;

/**
 * This class will demonstrate the variable scope in varioaus scenario
 * @author umesh
 *
 */
public class VariableScopeInClassMethodAndInThreadScenarion {
	
	final int num = 12;

	public void display() {

		int num = 20;

		Runnable r = new Runnable() {

			int num = 15;

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("In Thread scope, value of num --> " + num); 
			}
		};

		r.run();
		
		System.out.println("In local method scope, value of num --> " + num);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VariableScopeInClassMethodAndInThreadScenarion obj = new VariableScopeInClassMethodAndInThreadScenarion();
		
		System.out.println("In class level scope, value of num --> " + obj.num);
		
		obj.display();

	}

}

/*
 *  Output:
 *  In class level scope, value of num --> 12
	In Thread scope, value of num --> 15
	In local method scope, value of num --> 20

 */