package daily.programs;

import java.util.Collections;
import java.util.HashMap;

public class uniqueInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {-3,0,1,-3,1,1,1,-3,10,0};
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}

		System.out.println(map);
		
		int maxVal= Collections.max(map.values());
		System.out.println(maxVal);
		
		if(maxVal>1) {
			System.out.println("array is not unique: " + false);
		}else {
			System.out.println("Array is Unique : " +true);
		}
	}

}
