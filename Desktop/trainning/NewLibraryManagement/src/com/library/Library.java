package com.library;

public interface Library {
	default void showBooks() {
		System.out.println("It will show all books");
	}
	default void showCustomers() {
		System.out.println("It will show all the customers");
	}

}
