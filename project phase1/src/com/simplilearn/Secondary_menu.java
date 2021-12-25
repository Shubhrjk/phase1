package com.simplilearn;

import java.util.Scanner;

public class Secondary_menu {
	public void secondary()
	{
		Scanner sc7 =new Scanner(System.in);
	       int ch;         // initializing ch for infinite loop
	   do {
		   System.out.println("What oprations do you perform in folder  ");
	       System.out.println("1. Create a new file in folder ");
	       System.out.println("2. Show all files in folder ");
	       System.out.println("3. Delete a file ");
	       System.out.println("4. Search a file ");
	       System.out.println("5. Exit");
	       
	        Scanner sc1= new Scanner(System.in);
			int choice = sc1.nextInt();
			FileManager click = new FileManager();
			switch(choice) 
			{
			case 1:
				click.Addfile();
				break;
			case 2:
			    click.Showfile();
				break;
			case 3:
				click.Delfile();
				break;
			case 4:
				click.Searchfile();
				break;
			case 5:
				break;
			    default:
			    System.out.println("please enter valid key...");
			    break;
			}
		    System.out.println("*******************************************");
			System.out.println("do you want to continue??");
			System.out.println("1. to continue");
			System.out.println("2. to return to previous menu");
			ch =sc7.nextInt();
		} while(ch==1);	
	}
}
