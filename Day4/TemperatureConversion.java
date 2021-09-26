package Day4;

import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) {
		System.out.println("Enter 1 for conversion of farenheit to celcius ");
		System.out.println("Enter 2 for conversion of celcius to farenheit ");

		Scanner sc = new Scanner(System.in);

		int conversion = sc.nextInt();

		switch (conversion) {

		case 1:
			farenheit();
			break;

		case 2:
			temperature();

		}

	}

	static void farenheit() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperature in Farenheit");
		double temp = sc.nextDouble();

		double celcius = 0.0;

		celcius = (temp - 32) * 5 / 9;

		System.out.println("Temperature in celcius after conversion is  :" + celcius);

	}

	static void temperature() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperature in celcius");

		double temp1 = sc.nextDouble();
		sc.close();
		double farnheit = 0.0;

		farnheit = (temp1 * 9 / 5) + 32;

		System.out.println("Temperature in farnheit after conversion is  :" + farnheit);

	}
}