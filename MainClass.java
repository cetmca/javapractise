//package com.intvw.practise;

import java.io.InputStream;

public class MainClass {
  public static void main(String[] argv) throws Exception {
    String command = "ls -lrt /opt/documents/sales-invoice/*.pdf";
    Process child = Runtime.getRuntime().exec(command);

    InputStream in = child.getInputStream();
    int c;
    while ((c = in.read()) != -1) {
      System.out.println((char) c);
    }
    in.close();
  }
}

   