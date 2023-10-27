package algorithm;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Test2 {
	public static void main (String[] args) {
		
		int sum = 0;
		for(int i=1; i<=100; i++){
			sum += i;
		}
		//구구단
//		for(int i=1; i<=9; i++) {
//			for(int j=1; j<=9; j++) {
//				System.out.println(i + "x" + j + "= " + i*j);
//			}
//		}
		
		
		int nums = 999999;
		DecimalFormat df = new DecimalFormat("###,###");
		String money = df.format(nums);
		System.out.println(money);
		
		
		double num2 = 513234.394;
		DecimalFormat dfs = new DecimalFormat("#,##0.###");
		df.setGroupingUsed(true);
		String changenum = dfs.format(num2);
		System.out.print(num2);
		String[] a = {"tn"};
		
		}

}
