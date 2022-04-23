package jython.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.util.List;
import java.util.stream.Collectors;

import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.script.SimpleScriptContext;

public class JythonDemo {

	public static void main(String[] args) throws FileNotFoundException, ScriptException {
		System.out.println("Welcome to jython demo");
	//	ScriptEngineManagerUtils.listEngines();
		
		StringWriter writer = new StringWriter();
	    ScriptContext context = new SimpleScriptContext();
	    context.setWriter(writer);

	    ScriptEngineManager manager = new ScriptEngineManager();
	  //  ScriptEngine engine = manager.getEngineByMimeType("application/python");
	    ScriptEngine engine = manager.getEngineByName("python");
	    engine.eval(new FileReader(resolvePythonScriptPath("protoFileParser.py")), context);

	}
	
	 private List<String> readProcessOutput(InputStream inputStream) throws IOException {
	        try (BufferedReader output = new BufferedReader(new InputStreamReader(inputStream))) {
	            return output.lines()
	                .collect(Collectors.toList());
	        }
	    }

	    private static String resolvePythonScriptPath(String filename) {
	        File file = new File("D:/Umesh/2021/corepy/test_path/" + filename);
	        return file.getAbsolutePath();
	    }	

}
