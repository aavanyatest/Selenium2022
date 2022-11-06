package week1.day2;

public class Calculator {
	public int add(int num1, int num2, int num3) {
		int sum = num1 + num2 + num3;
		System.out.println("sum of 3 number:" +sum);
		return sum;
	}

	public int sub(int num1, int num2) {
		int subtraction = num1 - num2;
		System.out.println("Subtraction of 2 number:" +subtraction);
		return subtraction;
	}

	public double mul(double num1, double num2) {
		double product = num1 * num2;
		System.out.println("Multiplication of 2 double digit numbers: " +product);
		return product;
	}

	public float divide(float num1, float num2) {
		float division = num1 / num2;
		System.out.println("Division of 2 float numbers: " +division);
		return division;
	}

}
