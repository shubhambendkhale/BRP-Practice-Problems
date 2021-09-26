package Day3;

public class Stats5 {
	static void method() {
		double sum = 0;

		double n1 = Math.random();
		double n2 = Math.random();
		double n3 = Math.random();
		double n4 = Math.random();
		double n5 = Math.random();
		System.out.println("Numbers are :" + n1 + " , " + n2 + " , " + n3 + " , " + n4 + " , " + n5);

		sum = n1 + n2 + n3 + n4 + n5;

		double avg = sum / 5;

		double max = Math.max(n1, Math.max(n2, Math.max(n3, Math.max(n4, n5))));
		double min = Math.min(n1, Math.min(n2, Math.min(n3, Math.min(n4, n5))));
		System.out.println("Sum of 5 random numbers is :" + " " + sum);
		System.out.println("-------------------------------------------");
		System.out.println("Average of 5 random numbers is :" + " " + avg);
		System.out.println("-------------------------------------------");

		System.out.println("Max of 5 random numbers is :" + " " + max);
		System.out.println("-------------------------------------------");

		System.out.println("Min of 5 random numbers is :" + " " + min);
		System.out.println("-------------------------------------------");
	}

	public static void main(String[] args) {

		method();

	}
}
