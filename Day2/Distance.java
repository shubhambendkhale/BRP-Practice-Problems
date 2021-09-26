package Day2;

import java.util.Scanner;

public class Distance {

	static void distance() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The value of x:");
		double x = sc.nextDouble();
		System.out.println("Enter The value of y:");
		double y = sc.nextDouble();
		sc.close();

		double d = Math.sqrt(x * x + y * y);

		System.out.println("Distance form origin is :" + d);
	}

	public static void main(String[] args) {

		distance();
	}

}
