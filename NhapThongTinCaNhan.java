package demo;

import java.util.Scanner;

public class NhapThongTinCaNhan {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Your name is: ");
		String name = scanner.nextLine();
		System.out.print("Your age is: ");
		int age = scanner.nextInt();
		System.out.println("My name is " + name + ", age = " + age);
		scanner.close();
	}
}