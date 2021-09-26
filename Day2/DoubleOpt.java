package Day2;

import java.util.Scanner;

public class DoubleOpt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a");
		double a = sc.nextDouble();
		System.out.println("Enter value of b");
		double b = sc.nextDouble();
		System.out.println("Enter value of c");
		double c = sc.nextDouble();
		sc.close();

		double x = a + b * c;
		double y = a * b + c;
		double z = c + a / b;
		double q = a % b + c;

		System.out.println("x :" + x);
		System.out.println("y :" + y);
		System.out.println("z :" + z);
		System.out.println("q :" + q);

	}

}
