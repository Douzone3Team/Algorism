package algorithm_220503;

import java.util.Arrays;
import java.util.Scanner;

public class Swea_1204 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int[] avgN;
		int T = sc.nextInt();
		int asc;
		int N;
		int max;
		int maxIdx;
		while(T>0) {
			asc = sc.nextInt();
			avgN = new int[101];
			Arrays.fill(avgN, 0);
			
			for (int i = 1; i <= 1000; i++) {
				N = sc.nextInt();
				avgN[N] = avgN[N]+1;  
			}
			max=1;
			maxIdx=0;
			for (int i = 1; i <= 100; i++) {
				if(avgN[i]>=max) {
					max = avgN[i];
					maxIdx = i;
				}
			}
			
			System.out.println("#"+asc+" "+ maxIdx);
			T--;
		}	
	}
}
