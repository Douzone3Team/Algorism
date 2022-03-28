package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class b_2217 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int loop[] = new int[N];
		
		for (int i = 0; i < N; i++) {
			loop[i] = sc.nextInt();
		}
		
		Arrays.sort(loop);
		
		int max = 0;
		for (int i = N-1; i >= 0; i--) {
			loop[i] *= N-i;
			max = Math.max(max, loop[i]);
		}
		System.out.println(max);

	}

}
