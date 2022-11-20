package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8,10};
		
		Arrays.sort(arr);
		for(int i=arr[0];i<=arr.length;i++) {
			if(arr[i-1] != i) {
				System.out.println("Missing number in the array is: "  +i);
				break;
			}
		}

	}

}
