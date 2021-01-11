package corejava;

public class ThreadsDemo extends Thread {

	int x, y;
	
	public void run () {
		for(int i=0;i<1000;i++) {
			
			synchronized (this) {
				x=12;
				y=12;
			}
			
			System.out.println("x= "+x+"  y=" +y);
		}
	}
	
	public static void main(String args[]) {
		
		ThreadsDemo t1= new ThreadsDemo();
		ThreadsDemo t2= new ThreadsDemo();
		
		t1.start();
		t2.start();
	}
}
