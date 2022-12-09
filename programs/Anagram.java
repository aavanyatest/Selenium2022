package daily.programs;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	
	public static boolean isAnagram(String input1,String  input2) {
	char[] ch1=input1.toCharArray();
	char[] ch2=input2.toCharArray();
	
	boolean status=true;
	int l1=ch1.length;
	int l2=ch2.length;
	System.out.println(ch1.length);
	System.out.println(ch2.length);
	Arrays.sort(ch1);
	Arrays.sort(ch2);
	Arrays.equals(ch1, ch2);
	System.out.println(ch1);
	System.out.println(ch2);
	if(Arrays.equals(ch1, ch2) && l1==l2) {
		System.out.println(status);
	}else {
		System.out.println(status=false);
	}
	
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String input1=sc.nextLine();
		String input2=sc.nextLine();
		try {
			Anagram.isAnagram(input1, input2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		sc.close();

	}

}
