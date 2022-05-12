package algorithm_220511;

import java.util.Scanner;

public class Swea_1213 {
	public static void main(String[] args) {
		final int Test = 10;
		Scanner sc = new Scanner(System.in);
		String findStr;
		String allStr;
		for (int i = 0; i < Test; i++) {
			int n = sc.nextInt();
			findStr = sc.next();
			allStr = sc.next();
			int num = -1;
			
			int cnt =0;
			while((num = allStr.indexOf(findStr, num+1)) >= 0) {
				cnt++;
			}
			System.out.println("#"+n+ " "+ cnt);
		}//Test end
	}//main end
}
