package corejava;

import java.io.File;
import java.nio.file.Paths;

public class JavaIoTempdirTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  String tempDir = System.getProperty("java.io.tmpdir") + File.separator;
	  
	  System.out.println("Path --> " + tempDir);
	  
	  System.out.println("Path --> " + Paths.get(tempDir));
	}

}





















