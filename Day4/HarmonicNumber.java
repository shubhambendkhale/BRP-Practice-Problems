package Day4;

import java.util.Scanner;

public class HarmonicNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		sc.close();
		double harmonicNum = 0;

		if (num > 0) {
			for (int i = 1; i <= num; i++) {
				harmonicNum = harmonicNum + (1.0 / i);
			}
			System.out.println("Harmonic number is:" + harmonicNum);
		} else {
			System.out.println("Number should be greater than 0.");
		}
	}

}
