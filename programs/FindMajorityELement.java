
package daily.programs;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class FindMajorityELement {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		int[] nums = new int[n];
		for(int i=0;i<=n-1;i++) {
			nums[i] =sc.nextInt();
		}
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
		}

		System.out.println(map);
		
		int maxVal= Collections.max(map.values());
		System.out.println(maxVal);
		
		for (Entry<Integer,Integer> entry : map.entrySet()) {
			
			if(entry.getValue() == maxVal) {
				System.out.println(entry.getKey());
			}
			
			
		}

	}

}
