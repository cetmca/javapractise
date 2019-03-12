package com.intvw.practise;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.text.SimpleDateFormat;

public class FileCreationTime {
public  String getCreationDetails(File file)
    {       
       try{         
        Path p = Paths.get(file.getAbsolutePath());
        BasicFileAttributes view
           = Files.getFileAttributeView(p, BasicFileAttributeView.class)
                  .readAttributes();
        FileTime fileTime=view.creationTime();
      //  return (""+new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format((fileTime.toMillis())));
        return (""+new SimpleDateFormat("MM/yyyy").format((fileTime.toMillis())));
       }
       catch(IOException e){ 
        e.printStackTrace(); 
       }
       return ""; 
   }

   public static void main(String...str){
       System.out.println
           (new FileCreationTime().getCreationDetails(new File("D:/connect.png")));
   }
}