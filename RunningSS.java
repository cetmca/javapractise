package com.intvw.practise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RunningSS {
 public static void main(String[] args) {
  Process p;
  try {
   String[] cmd = { "ls -l", "C:\\Users\\agopinathan\\Desktop\\aggdocuments"};
   p = Runtime.getRuntime().exec(cmd); 
   p.waitFor(); 
   System.out.println("-------------");
   BufferedReader reader=new BufferedReader(new InputStreamReader(
    p.getInputStream())); 
   String line; 
   while((line = reader.readLine()) != null) { 
    System.out.println(line);
   } 
  } catch (IOException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  } catch (InterruptedException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  }
 }
}
