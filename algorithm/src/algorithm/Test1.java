package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test1 {
	
	public static void main(String[] args) {
		//데이터 정렬 : sort / comparable
		//오름차순
		int a[] = {1,3,6,2};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		//내림차순
		Integer b[] = {1,4,5,2,6,3};
		Arrays.sort(b, Collections.reverseOrder()); //객체형태로 선언해야 collection 사용가능
		System.out.println(Arrays.toString(b));
		
		List<Integer> nums = new ArrayList<>();
		nums.add(1);
		nums.add(4);
		System.out.print(nums);
		
	}
}
