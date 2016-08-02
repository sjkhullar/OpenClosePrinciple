package org.learn.ocp.db;


public class SQLiteDatabaseHandler implements DatabaseHandler {

	public boolean open() {
		//Open database connection of SQLite database
		return false;
	}

	public boolean close() {
		//close database connection of SQLite database
		return false;
	}

	public int create(Object record) {
		//...
		return 0;
	}

	public Object retrieve(int id) {
		//...
		return null;
	}

	public int retrieve(Object record) {
		//...
		return 0;
	}

	public int delete(int id) {
		//...
		return 0;
	}
}