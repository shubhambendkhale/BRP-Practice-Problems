package Day2;

import java.util.Scanner;

public class IntOpt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a");
		int a = sc.nextInt();
		System.out.println("Enter value of b");
		int b = sc.nextInt();
		System.out.println("Enter value of c");
		int c = sc.nextInt();
		sc.close();

		int x = a + b * c;
		int y = a * b + c;
		int z = c + a / b;
		int q = a % b + c;

		System.out.println("x :" + x);
		System.out.println("y :" + y);
		System.out.println("z :" + z);
		System.out.println("q :" + q);

	}
}