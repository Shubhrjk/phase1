package com.simplilearn;

import java.io.*;
import java.util.Scanner;

public class Dynamic_class {

	public static void main(String[] args) {
		 System.out.println("*******************************************");
		   System.out.println("         WELCOME TO PHASE 1 PROJECT        \n");
		   System.out.println("       DEVELOPER NAME -  SHUBHAM RAJAK     ");
	       System.out.println("*******************************************\n");
	       System.out.println("press any number to enter project...");
		   File f1 = new File("C:\\Users\\rajak\\OneDrive\\Desktop\\Project");
	       f1.mkdir();
	       Scanner entry =new Scanner(System.in);
	       String E = entry.next();
	      if(E != null) 
	     while(true) 
	     {  
	    	  System.out.println("1. Show all the files in folder");
	    	  System.out.println("2. to perform operations in folder");
	    	  System.out.println("3. Exit the program");
	    	  System.out.println("*******************************************");
	    	  Scanner sc1 = new Scanner(System.in);
	    	  int PM = sc1.nextInt();
	    	  switch(PM)
	    	  {
	    	  case 1:
	    		  FileManager click1 = new FileManager();
		           click1.Showfile();
	    	  break;
	    	  case 2:
	    		  Secondary_menu click2 = new Secondary_menu();
	    		  click2.secondary();
	          break;
	    	  case 3:
	    		  System.out.println("#######  Program terminated successfully  ######### ");
	    		  System.exit(0);
	    	  break;
	    	  default:
	    		  System.out.println("Incorrect input !!!  Please re enter ");
	    	 }
	      }
	  	}

}
