package week3.day1;

public class Calculator {
	
	public void add(int val1, int val2) {
		System.out.println(val1+val2);
	}
	
	public void add (int val1, int val2, int val3) {
		System.out.println(val1+val2+val3);
	}
	
	public void sub(double va1, double va2) {
		System.out.println(va1-va2);
	}
	
	public void sub(int v1, int v2) {
		System.out.println(v1-v2);
		
	}

	
	public void mul(int m1, double m2) {
		System.out.println(m1*m2);
	}
	
	
	public void mul( int m1, int m2, int m3) {
		System.out.println(m1*m2*m3);
	}
	public static void main(String[] args) {
		Calculator cal= new Calculator();
		cal.add(5, 7);
		cal.add(5, 7, 9);
		cal.sub(2.3, 1.2);
		cal.sub(6 , 4);
		cal.mul(5, 6.67);
		cal.mul(5, 6,7);

	}

}
