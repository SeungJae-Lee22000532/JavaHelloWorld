package com.example.lab1;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		System.out.println("Hello World!!!");
		
		Scanner s = new Scanner(System.in);
		System.out.print("\n�̸� �Է� : ");
		String name = s.next();
		System.out.print("���� �Է� : ");
		int age = s.nextInt();
		
		System.out.println("[" + name + ", " + age + "]�� ȯ���մϴ�~");
	}
}
