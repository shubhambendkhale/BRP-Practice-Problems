package Day3;

import java.util.Scanner;

public class WindChill {

	public static void method() {
		double w = 0, v, t;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Temperature in Fahrenheit");
		t = sc.nextDouble();
		System.out.println("Enter the Speed in miles/hr");
		v = sc.nextDouble();
		sc.close();
		if (v <= 50 && t > 3 && t < 120) {

			w = 35.74 + 0.6215 * t + ((0.4275 * t - 35.75) * Math.pow(v, 0.16));

			System.out.println("WindChill =" + w);

		} else {
			System.out.println("Enter proper input i.e v greater than or equal to 50 And t between 3 to 120");
		}

	}

	public static void main(String[] args) {

		method();

	}

}
