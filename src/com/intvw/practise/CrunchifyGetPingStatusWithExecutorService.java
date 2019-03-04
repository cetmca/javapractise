package com.intvw.practise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
 
 
public class CrunchifyGetPingStatusWithExecutorService {
	private static final int MYTHREADS = 30;
 
	public static void main(String args[]) throws Exception {
		ExecutorService executor = Executors.newFixedThreadPool(MYTHREADS);
		
		String[] hostList = { "Apr:2018","Jan:2018","May:2017"};
 
		for (int i = 0; i < hostList.length; i++) {
 
			String url = hostList[i];
			Runnable worker = new MyRunnable(url);
			executor.execute(worker);
		}
		executor.shutdown();
		// Wait until all threads are finish
		while (!executor.isTerminated()) {
 
		}
		System.out.println("\nFinished all threads");
	}
 
	public static class MyRunnable implements Runnable {
		private final String url;
 
		MyRunnable(String url) {
			this.url = url;
		}
 
	 public void run() {
 

				String[] arguments = url.split(":"); 
				//
		        try {
		            String[] cmd = { "/bin/sh", "-c", "ls -lrt /opt/documents/sales-invoice/*.pdf | grep "+arguments[0]+" | grep "+ arguments[1]};
		               Process process = Runtime.getRuntime().exec(cmd);
		               String[] fileName;
		               //
		               BufferedReader reader = new BufferedReader(new InputStreamReader(        
		            	        process.getInputStream()));                                          
		            	    String s;                                                                
		            	    while ((reader.readLine()) != null) {  
		            	    	System.out.println("!!!!!!!!!! -->>>Script output: -->"+reader.readLine()); 
		            	    	fileName = reader.readLine().split(arguments[1]);
		            	      System.out.println("Script output: -->"+fileName[1].replaceAll("\\s+",""));   
		            	    } 
		               
		               //
		            	    System.out.println(cmd[2].toString());

		            } catch (IOException e) {
		                e.printStackTrace();
		            }
				
				
				
				
				//

			System.out.println(url + "\t\tStatus:");
		}
	}
}
