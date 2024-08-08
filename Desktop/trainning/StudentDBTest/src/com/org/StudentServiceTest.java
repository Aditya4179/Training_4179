package com.org;

import java.util.Scanner;

public class StudentServiceTest {
	public static void main(String args[]) {
		StudentService service=new StudentService();
		Scanner sc=new Scanner(System.in);
		/*s.display();
		s.add(new Student(103,"Madhu","Dhule"));
		s.add(new Student(104,"Isha","Amaravati"));
		s.display();*/
		
		int ch;
		int id;
		String name,city;
		do {
			System.out.println("1.Add\n2.remove\n3.update\n4.display\n5.exit");
			System.out.println("Please enter your choice : ");
			ch=sc.nextInt();
			switch(ch) {
				case 1:
					System.out.println("Enter id : ");
					id=sc.nextInt();
					System.out.println("Enter name : ");
					name=sc.next();
					System.out.println("Enter city : ");
					city=sc.next();
					
					service.add(new Student(id,name,city));
					break;
				case 2:
					System.out.println("Enter id to remove : ");
					id=sc.nextInt();
					service.remove(id);
					break;
				case 3:
					System.out.println("Enter id : ");
					id=sc.nextInt();
					System.out.println("Enter name : ");
					name=sc.next();
					System.out.println("Enter city : ");
					city=sc.next();
					
					service.update(new Student(id,name,city));
					break;
				case 4:
					service.display();
					break;
				case 5:System.exit(0);
					
			}		
		}while(true);
		
	}

}
