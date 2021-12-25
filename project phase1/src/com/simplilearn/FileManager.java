package com.simplilearn;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class FileManager {
	public void Addfile()           //File creation
	{
		System.out.println("please! Enter the file to be created (with extension)...");
		Scanner sc1 = new Scanner(System.in);
    	String str1 =sc1.next();
		File fil = new File("C:\\Users\\rajak\\OneDrive\\Desktop\\Project\\"+str1);
	    if(fil.exists()) 
	    {
	    	System.out.println("File is already there.......");
	    }
	    else {
		try { 
			fil.createNewFile();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		System.out.println("File created successfully....");
	    }
	}
	
	public void Delfile()    // for deleting the file
	{
		System.out.println("please Enter the file to be Deleted...");
		Scanner sc2 = new Scanner(System.in);
    	String str2 =sc2.next();
        File FilToDel = new File("C:\\Users\\rajak\\OneDrive\\Desktop\\Project\\"+str2);
        
           if (FilToDel.delete()) 
             {
        	 System.out.println("file deleted successfully...");
             }
         else
             {
        	 System.out.println("no file found with such name...");
             }
     }
	
	public void Showfile()    // for listing all files
	{
		File FilToList = new File("C:\\Users\\rajak\\OneDrive\\Desktop\\Project");
    	File array[] =FilToList.listFiles();
    	for(int i=0;i<array.length;i++) 
    	   {
    		  System.out.println(array[i]);
    	   }
	}
	public void Searchfile() 
	{
		System.out.println("please Enter the file name to find ...");
		Scanner sc3 = new Scanner(System.in);
    	String str3 =sc3.next();
    	File FilToList = new File("C:\\Users\\rajak\\OneDrive\\Desktop\\Project");
    	File array[] =FilToList.listFiles();
    	if(FilToList.exists()) 
    	{
    	for(int i=0;i<array.length;i++) 
    	   {
    		if(array[i].getName().startsWith(str3))
    		   {
    		      System.out.println(array[i]);
    		      System.out.println("File is present in the folder");
    	       }
    		
    	   }
    	
    	}
    	else {
    		System.out.println("No file with such name...");
    	     }
	}
}
