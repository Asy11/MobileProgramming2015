package kr.ac.kookmin.exception.fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class AddLineNumber
{
   public static void main(String[] args)
   {
       String path = AddLineNumber.class.getResource("").getPath();
       System.out.println(path);

      try{
         BufferedReader inputStream = new BufferedReader(new FileReader(path+"original.txt"));
         PrintWriter outputStream = new PrintWriter(new FileOutputStream(path+"numbered.txt"));
         
         String s;
         int i = 1;

		 while ((s = inputStream.readLine()) != null) {
			 outputStream.write(i+" "+s);
			 outputStream.println();
			 
			 i++;
		 }
		    
         inputStream.close( );
         outputStream.close( );
      }catch(IOException e){
    	  e.printStackTrace();
      }
   }
}