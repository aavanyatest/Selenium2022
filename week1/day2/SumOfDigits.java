package week1.day2;

public class SumOfDigits {

	public static void main(String[] args) {
		int num = 333;
		int sum = 0;

		while (num > 0) {
			int rem = num % 10;
			sum = sum + rem;
			num = num / 10;
																																																																																																																																																									
		}
		if (sum > 9) {
			int sum1 = 0;
			while (sum > 0) {
				int rem = sum % 10;
				sum1 = sum1 + rem;
				sum = sum / 10;

			}
			System.out.println(sum1);
		} else {
			System.out.println(sum);
		}
	}
}
