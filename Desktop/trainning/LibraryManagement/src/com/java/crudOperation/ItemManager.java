package com.java.crudOperation;

public interface ItemManager {
	void addItem(Item item);
	void remove(Item item);
	void update(Item item);
	void listAll();

}
