package com.wb;

import java.util.Iterator;

import com.wb.Times.Task;

/*
 * 0 1 1 2 3 5 8 13 ...
 */
public class _02_斐波那契数 {
	public static int fib1(int n) {
		if (n <= 1) return n;
		return fib1(n - 1) + fib1(n - 2);
	}
	
	public static int fib2(int n) {
		if (n <= 1) return n;
		int first = 0;
		int second = 1;
		for (int i = 0; i < n - 1; i++) {
			int sum = first + second;
			first = second;
			second = sum;
		}
		return second;
	}
	
	public static void main(String[] args) {
		System.out.println(fib1(3));
		System.out.println(fib2(3));
		
		Times.test("fib2", new Task() {
			
			@Override
			public void execute() {
				// TODO Auto-generated method stub
				fib2(20);
			}
		});
		
		Times.test("fib1", new Task() {
			
			@Override
			public void execute() {
				// TODO Auto-generated method stub
				fib1(20);
			}
		});
		
	}
}
