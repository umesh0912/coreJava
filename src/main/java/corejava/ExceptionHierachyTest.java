package corejava;

/**
 * Exception hirarchy test
 * @author umesh
 *
 */
public class ExceptionHierachyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{    
		    int a[]=new int[5];    
		    a[5]=30/0;    
		   }    
		   catch(Exception e){System.out.println("completed");}    
		 //  catch(ArithmeticException e){System.out.println("completed1");}    		this will not compile
		 //  catch(ArrayIndexOutOfBoundsException e){System.out.println("completed3");} this will not compile    
		   System.out.println("rest of the code...");    
	}

}
