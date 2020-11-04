package corejava;

public class TryAndFinallyBasicQuestion {

	public static void main(String[] args) {

		System.out.println("Get -->" + getTrueOrFlase());
		
	}

	static Boolean getTrueOrFlase() {

		try {
		  	return true;
			//throw new Exception();
			//System.out.println("Some code");// --> This will not compile unreachable code
		} catch (Exception e) {
			
			// no o/p 
			try {
				System.out.println("Inner try bloc");
			} finally {
				System.out.println("Inner finally block");
			}
		}

		finally {
			final String str="umesh"; //we can  declare variable in final block <-- this was asked in transunion cibil interview
			return false;
		}
	}
}
/*
 * output:
 * 
 * Get -->false
 */
