package com.example.lab1;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		System.out.println("Hello World!!!");
		
		Scanner s = new Scanner(System.in);
		System.out.print("\n이름 입력 : ");
		String name = s.next();
		
		System.out.println("[" + name + "]님 환영합니다~");
	}
}
