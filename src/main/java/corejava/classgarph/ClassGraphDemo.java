package corejava.classgarph;

import io.github.classgraph.ClassGraph;
import io.github.classgraph.ClassInfoList;
import io.github.classgraph.ScanResult;

public class ClassGraphDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Umesh");
		
		String path ="D:/Umesh/first/brainwave/brainwave-api/target/";
		
		ScanResult scanResult = new  ClassGraph()
				.verbose()
				.enableAllInfo()
				.overrideClasspath(path + "brainwave-api-eb.jar!/BOOT-INF/lib/")
				//.whitelistJars("spring-boot-*.jar")
				.whitelistPackages("org.springframework.stereotype", "org.springframework.web")
				.scan();
		
	System.out.println("Total classes scaned -->" + scanResult.getAllAnnotations().size());
	
	String path1 = System.getProperty("java.class.path");
	
	System.out.println("path1 --> " +path1);
	scanResult.getAllAnnotations().forEach(System.out::println);
		
		
	}

}
