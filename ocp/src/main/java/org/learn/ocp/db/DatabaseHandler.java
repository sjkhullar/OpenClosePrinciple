package org.learn.ocp.db;

public interface DatabaseHandler {
	boolean open();
	boolean close();
	int create(Object record);
	Object retrieve(int id);
	int retrieve(Object record);
	int delete(int id);
}