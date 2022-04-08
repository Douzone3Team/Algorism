package baekjoon;

import java.util.ArrayList;

public class b_4673 {
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		for (int i = 1; i < 10001; i++) {
			list.add(String.valueOf(i));
		}
		
		for(int i = 1; i <10001; i++) {
			String n = String.valueOf(d(i));
			if(list.contains(n)) {
				list.remove(n);
			}
		}
		
		for (String i : list) {
			System.out.println(i);
			
		}
	}

	public static int d(int num) {
		int sum = num;
	
		while(num > 0) {
			sum = sum + (num%10);
			num = num / 10;
		}
//		System.out.println("sum:"+sum);
		return sum;
	}
	

}
