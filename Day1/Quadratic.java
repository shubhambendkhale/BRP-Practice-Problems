package Day1;

import java.util.Scanner;

public class Quadratic {
	static void method() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a");
		double a = sc.nextDouble();

		System.out.println("Enter the value of b");
		double b = sc.nextDouble();
		System.out.println("Enter the value of c");
		double c = sc.nextDouble();
		sc.close();
		double x1 = 0;
		double x2 = 0;

		x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
		x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);

		System.out.println("x1=" + x1);
		System.out.println("x2=" + x2);
	}

	public static void main(String[] args) {

		method();
	}

}
