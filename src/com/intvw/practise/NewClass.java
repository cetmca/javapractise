//package com.intvw.practise;
import java.io.*;

class NewClass 
{ 
	public static void main(String[] args) throws IOException, InterruptedException {
        try {
        String[] cmd = { "/bin/sh", "-c", "ls -lrt /opt/documents/sales-invoice/*.pdf | grep "+args[0]+" | grep "+ args[1]};
           Process process = Runtime.getRuntime().exec(cmd);
           String[] fileName;
           //
           BufferedReader reader = new BufferedReader(new InputStreamReader(        
        	        process.getInputStream()));                                          
        	    String s;                                                                
        	    while ((reader.readLine()) != null) {        
        	    	fileName = reader.readLine().split(args[1]);
        	      System.out.println("Script output: -->"+fileName[1].replaceAll("\\s+",""));   
        	    } 
           
           //
        	    System.out.println(cmd[2].toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}