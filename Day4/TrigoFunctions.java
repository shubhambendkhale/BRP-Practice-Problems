package Day4;

import java.util.Scanner;

public class TrigoFunctions {

	public static void main(String[] args) {

		values();

	}

	static void values() {
		System.out.println("Enter the angle in degrees");

		Scanner sc = new Scanner(System.in);

		int deg = sc.nextInt();
		sc.close();
		double b = Math.toRadians(deg);

		System.out.println(Math.sin(b));
		System.out.println(Math.cos(b));
	}
}