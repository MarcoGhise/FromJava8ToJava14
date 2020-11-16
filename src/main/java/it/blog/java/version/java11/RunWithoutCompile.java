package it.blog.java.version.java11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RunWithoutCompile {
	
	public static void main(String[] args)
	{
		ProcessBuilder processBuilder = new ProcessBuilder();

	    // -- Windows --

	    // Run a command
	    processBuilder.command("C:\\Programmi\\java\\jdk-14.0.2\\bin\\java.exe",  "C:\\eclipse-java-2020-06\\workspace\\JavaVersion\\src\\main\\java\\it\\blog\\java\\version\\java11\\Http.java");	 

	    try {

	        Process process = processBuilder.start();

	        StringBuilder output = new StringBuilder();

	        BufferedReader reader = new BufferedReader(
	                new InputStreamReader(process.getInputStream()));

	        String line;
	        while ((line = reader.readLine()) != null) {
	            output.append(line + "\n");
	        }

	        int exitVal = process.waitFor();
	        if (exitVal == 0) {	         
	            System.out.println(output);
	            System.exit(0);
	        }
	        else
	        	System.out.println(exitVal);

	    } catch (IOException e) {
	        e.printStackTrace();
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	
	}

}
