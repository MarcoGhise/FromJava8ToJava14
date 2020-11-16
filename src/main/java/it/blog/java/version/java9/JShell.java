package it.blog.java.version.java9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JShell {

	public static void main(String[] args) {
		ProcessBuilder processBuilder = new ProcessBuilder();

	    // -- Windows --

	    // Run a command
	    processBuilder.command("cmd.exe", "/c", "C:\\Programmi\\java\\jdk-14.0.2\\bin\\jshell.exe --help");	 

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

	    } catch (IOException e) {
	        e.printStackTrace();
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	}
}
