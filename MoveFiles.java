//package com.intvw.practise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 //10.206.14.2
 
public class MoveFiles {
	private static final int MYTHREADS = 10;
 
	public static void main(String args[]) throws Exception {
		ExecutorService executor = Executors.newFixedThreadPool(MYTHREADS);
		
		//String[] hostList = { "Apr:2018","Jan:2018","May:2017"};
		//String[] hostList = { "Apr:2018","May:2017"};
		String[] hostList = { "May:2017"};
 
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
 

		 System.out.println ("Thread " + 
                 Thread.currentThread().getId() + 
                 " is running"); 
		 
				String[] arguments = url.split(":"); 
				
				// rwxrwxrwx 1 jboss jboss 10648 May 31  2017 /opt/documents/sales-invoice/salesInvoice_48800002.pdf
				
				String pat = "(.*)(\\/opt.*)";
				Pattern pattern = Pattern.compile(pat);
				
				//
		        try {
		            String[] cmd = { "/bin/sh", "-c", "ls -lrt /opt/documents/sales-invoice/*.pdf | grep "+arguments[0]+" | grep "+ arguments[1]};
		           
		               Process process = Runtime.getRuntime().exec(cmd);
		               String[] fileName;
		               String pdfFileName;
		               String strDestination="/tmp/docs";
		               int bufferSize = 8 * 1024;
		               //
		               BufferedReader reader = new BufferedReader(new InputStreamReader(        
		            	        process.getInputStream()),bufferSize);                                          
		            	    String s;     
		            	    
		            	   
		            	   int i=0; 
		            	    while ((pdfFileName = reader.readLine()) != null)
		            	   	System.out.println("!!!!!!!!!! -->>>Selected File: -->"+ i++ +"-------" +reader.readLine()); 
		            	    	fileName = pdfFileName.split(arguments[1]);
		            	    	pdfFileName=fileName[1].replaceAll("\\s+","");  
		            	    	
		            	    	Matcher matcher = pattern.matcher(reader.readLine());
		            	    	if (matcher.find())
		            	    	{
		            	    	   // System.out.println("---"+matcher.group(2));
		            	    		String[] copyFile = new String[] {"/bin/sh", "-c", "mv "+ matcher.group(2)+" "+strDestination};  
		            	           // System.out.println("---"+copyFile[2]);
		            	            Process pr = Runtime.getRuntime().exec(copyFile);
		            	    	    
		            	    	}
		            	    	
		            	    } 
		               
		               //
		            	    System.out.println("CMD ---"+cmd[2].toString());

		            } catch (IOException e) {
		                e.printStackTrace();
		            } catch(NullPointerException e){
		        		e.printStackTrace();
		        }
				
				
				
				
				//

			System.out.println(url + "\t\tStatus:");
		}
	}
}
