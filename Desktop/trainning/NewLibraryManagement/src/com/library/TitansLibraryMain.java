package com.library;

public class TitansLibraryMain {
	public static void main(String args[]) {
		Admin admin1=new Admin(5,5);
		admin1.addBook(new Book(101,"movienew","kari","moviebook"));
		admin1.addBook(new Book(202,"fantacy1","chinna","fantacybook"));
		admin1.addBook(new Book(303,"stories","madhu","storybook"));
		admin1.addBook(new Book(404,"annimation","chinna","technicalbook"));
		admin1.showAllBooks();
		admin1.removeBook(202);
		admin1.showAllBooks();
		Book b=new Book(303,"story1","Isha","storybook");
		admin1.replaceBook(b);
		admin1.showAllBooks();
		
		admin1.addCustomer(new Customer(100,"Karishma",8897979309L));
		admin1.addCustomer(new Customer(200,"Madhuri",8897979309L));
		admin1.addCustomer(new Customer(300,"Tejal",8897979309L));
		admin1.showAllCustomers();
		admin1.removeCustomer(100);
		admin1.showAllCustomers();
		admin1.addCustomer(new Customer(300,"Tejal",8897979309L));
		admin1.showAllCustomers();
	}

}
