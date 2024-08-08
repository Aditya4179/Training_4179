package com.library;

public interface Library {

	default void show() {
		System.out.println("It will show required details");
	}
}
