package algorism;

import java.util.Scanner;

public class manyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		
		for (int i = 1; i <= T; i++) {
			int max = 0;
			int TC = sc.nextInt();
			int []students = new int[1000];
			int []scores = new int[101];
			
			for (int j = 0; j < 1000; j++) {
				students[j] = sc.nextInt();
				scores[students[j]]++;
			}
			
			for (int j = 0; j < 100; j++) {
				if(scores[max] <= scores[j] ) {
					max = j;
				}
			}
			System.out.println("#" + TC + " " + max);
		}
	}

}
