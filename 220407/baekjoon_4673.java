package coding_220407;

import java.util.Arrays;

public class baekjoon_4673 {
	public static void main(String[] args) {
		boolean[] ch = new boolean[10001];
		
		Arrays.fill(ch, false);
		
		for (int i = 1; i <= 10000; i++) {
			int n = d(i);
			if(n<=10000) ch[n] = true;
		}
		
		for (int k = 1; k <=10000 ; k++) {
			if(ch[k] == false)
			System.out.println(k);
		}
	}
	
	public static int d(int N) {
		int sum = N;
		while(N>0) {
			sum = sum + (N%10);
			N = N/10;
		}
		return sum;
	}
}
