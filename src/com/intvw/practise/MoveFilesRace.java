//package com.intvw.practise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * Fix for issue -bash: /bin/ls: Argument list too long 
 * NO year in ls listing
 * @author agopinathan
 *
 */
 
public class MoveFilesRace {
	private static final int MYTHREADS = 10;
	private static final String FILE_PATTERN = 
            "([^\\s]+(\\.(?i)(pdf))$)";
	private static final String strSrcFolder="/opt/documents/sales-invoice/";
	private static final String strDestination="/tmp/docs/";
 
	public static void main(String args[]) throws Exception {
		ExecutorService executor = Executors.newFixedThreadPool(MYTHREADS);
		
		//String[] monthyearList = { "Apr:2018","Jan:2018","May:2017"};
		String[] monthyearList = { "Feb:2018"};
		// To avoid the race around condition, constructing the HashMap before executing the worker thread
		
		HashMap<String, ArrayList<String>> listOfPdfsForSelectedDate = new HashMap<String, ArrayList<String>>();
		
		String[] fileName;
		
		for (int i = 0; i < monthyearList.length; i++) {
			String url = monthyearList[i];
			String[] arguments = url.split(":");  // monthyearList  pattern
			//ls -lrt /opt/documents/sales-invoice/*.pdf | grep May | grep 2017
			//String[] cmd = { "/bin/sh", "-c", "ls -lrt /opt/documents/sales-invoice/*.pdf | grep "+arguments[0]+" | grep "+ arguments[1]+" | tail -n +2" };
			//String[] cmd = { "/bin/sh", "-c", "ls -lrt /tmp/docs/*.pdf | grep "+arguments[0]+" | tail -n +2 | awk '{print $9}'" };
			// -bash: /bin/ls: Argument list too long +NO year in ls listing -- ISSUE fix
			String[] cmd = { "/bin/sh", "-c", "ls -lrt /tmp/docs/ | grep "+arguments[0]+" | tail -n +2 | awk '{print $9}'" }; 
			System.out.println("---------CMD "+cmd[2]);
			Process process = Runtime.getRuntime().exec(cmd);
			int bufferSize = 8 * 1024;
			BufferedReader reader = new BufferedReader(new InputStreamReader(        
					process.getInputStream()),bufferSize);                                          

			Pattern pattern = Pattern.compile(FILE_PATTERN);
			Matcher matcher;
			//
			String line = null;
			ArrayList<String> listOfPdfs = new ArrayList<String>();
			while ((line = reader.readLine()) != null)
			{
				matcher = pattern.matcher(line);
				//fileName = line.split(arguments[1]);
				if(matcher.matches()){
					//System.out.println("-------->>"+line);
					listOfPdfs.add(line.replaceAll("\\s+",""));
				}
			}
			listOfPdfsForSelectedDate.put(url, listOfPdfs);
			//
		}
		//
		for (Entry<String, ArrayList<String>> entry : listOfPdfsForSelectedDate.entrySet()) {
	       // System.out.println(entry.getKey() + ":" + entry.getValue());
			Runnable worker = new MyRunnable(entry.getValue());
			executor.execute(worker);
	    }
		//
		executor.shutdown();
		// Wait until all threads are finish
		while (!executor.isTerminated()) {
 
		}
		System.out.println("\nFinished all threads");
	}
 

	
	
	public static class MyRunnable implements Runnable {
		private final ArrayList<String> listOfPdfs;
 
		MyRunnable(ArrayList<String> listOfPdfs) {
			super();
			this.listOfPdfs = listOfPdfs;
		}

	 public void run() {
		 System.out.println ("Thread " + 
                 Thread.currentThread().getId() + 
                 " is running"); 
				//
		 try {
			 String[] fileName;
			 String strDestination="/tmp/docs/move/";
			 String strSrc="/tmp/docs/";
			 //
			 for (String pdfFile : listOfPdfs) {
				// System.out.println("----------->>"+pdfFile);
				 String[] copyFile = new String[] {"/bin/sh", "-c", "cp "+ strSrc+pdfFile+" "+strDestination};  
				// System.out.println("---------CMD "+copyFile[2]);
				// String[] copyFile = new String[] {"/bin/sh", "-c", "mv "+ pdfFile+" "+strDestination};  
				 Process pr = Runtime.getRuntime().exec(copyFile);
			 }
		 }  catch(NullPointerException e){
			 e.printStackTrace();
		 }
		 catch(IOException e){
			 e.printStackTrace();
		 }
				
			//

		}
	}
}
