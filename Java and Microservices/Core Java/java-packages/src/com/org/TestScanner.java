package com.org;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an int");
		int num = scan.nextInt();
		System.out.println("Enter a string");
		String word = scan.next();
		System.out.println("Num = "+num+", Word = "+word);
		scan.close();
	}

}
