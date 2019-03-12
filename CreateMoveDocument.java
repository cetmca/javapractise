package com.intvw.practise;

import java.io.File;
import java.io.IOException;

public class CreateMoveDocument {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Process p = Runtime.getRuntime().exec(new String[]{"bash","-c","ls -l C:/interview/"});
		
		File file1 = new File("C:\\Users\\agopinathan\\Desktop\\tickets\\Boarding-documents.pdf");
		FileCreationTime fst = new FileCreationTime();
		
		System.out.println
        (new FileCreationTime().getCreationDetails(file1));

	}

}
