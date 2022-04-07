package coding_220406;

import java.util.Scanner;

public class baekjoon_1120 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String A = sc.next();
		String B = sc.next();
		
		int result = A.length();
		for (int i = 0; i < B.length()-A.length()+1; i++) {
			int cnt =0;
			for (int j = 0; j < A.length(); j++) {
				if(A.charAt(j) != B.charAt(i+j)) cnt++;
			}
			result = Math.min(result, cnt);
		}
		System.out.println(result);
	}
}
