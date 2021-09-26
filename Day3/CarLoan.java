package Day3;

import java.util.Scanner;

public class CarLoan {

	public static void method() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of Principal amount");
		double p = sc.nextDouble();
		System.out.println("Enter years for payment");
		double y = sc.nextDouble();
		System.out.println("Enter rate of interest ");
		double r = sc.nextDouble();
		sc.close();

		double t = r / (12 * 100);
		double n = 12 * y;

		double payment = p * t / (1 - (Math.pow((1 + t), -n)));

		System.out.println("Payment to be paid on monthly basis will be :" + payment);
		
	}

	public static void main(String[] args) {

		method();

	}

}
