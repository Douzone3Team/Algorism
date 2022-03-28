package coding_220318;

import java.util.Scanner;

public class baekjoon_1789 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long S =  sc.nextLong();
		int cnt =0;
		int i = 1;
		while(S>cnt) {
			S = S - i;
			i = i + 1;
			cnt++;
		}
		System.out.println(cnt);
	}
}
