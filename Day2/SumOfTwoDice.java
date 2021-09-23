package Day2;

public class SumOfTwoDice {

	static void sumOfRandom() {
		int dice1 = (int) (Math.random() * 6 + 1); /* Random number between 1 and 6 */
		int dice2 = (int) (Math.random() * 6 + 1); /* Random number between 1 and 6 */
		int sum = dice1 + dice2;
		System.out.println("sum of two random integer numbers is :" + sum);
	}

	public static void main(String[] args) {

		sumOfRandom();

	}

}
