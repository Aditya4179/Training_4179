package com.library;

import java.util.ArrayList;
import java.util.Scanner;

public class MainTitansLibrary {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int choice;
		int count;
		ArrayList<Book> book=new ArrayList<Book>();
		ArrayList<Person> person=new ArrayList<Person>();
		System.out.println("Ente");
		do {
		System.out.println("1.Book Service \n 2.Person Service \n 3.Do you want to Continue (y/n) : ");
		System.out.println("Please Enter service number you want to access :  ");
		choice=sc.nextInt();
		switch(choice) {
		case 1 :
				System.out.println("1.Add Book \n 2.Remove Book \n 3.Replace Book \n 4.Show All Books \n ");
				System.out.println("Enter your choice : ");
				choice=sc.nextInt();
				switch(choice) {
				default: break;
				}break;
				
		case 2 : 
				System.out.println("1.Add Person \n 2.Remove Person  \n 3.Show All Person \n 4.Borrow Book \n 5.Remove Book");
				System.out.println("Enter your choice : ");
				choice=sc.nextInt();
				switch(choice) {
				default: break;
				}break;
				
				
			
		}
		}while(0<0);
	}
}
