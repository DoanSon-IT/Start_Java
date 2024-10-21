package demo;

import java.util.Scanner;

public class Su_dung_ham_Math {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập a: ");
		int a = scanner.nextInt();
		System.out.print("Nhập b: ");
		int b = scanner.nextInt();

		// Sử dụng hàm Math để tìm ra số nào là max, min.
		System.out.println("Max: " + Math.max(a, b));
		System.out.println("Min: " + Math.min(a, b));
	}
}
