package com.in28minutesFirstJavaProject;

public class Multiplicationtable {
	void print() {
		print(5);
	}
	
	void print(int table) {
		print(table,1,10);
		}
	
	void print(int table, int from, int to) {
		for(int i=from; i<=to; i++) {
			System.out.printf("%d x %d = %d", table, i, table * i).println();
		}
	}
}
