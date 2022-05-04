package algorism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class UCR_1208 {
	// 1. 배열에 담아 sort정렬
	// 2. 최소값 ++ , 최대값--
	// 3. dump값동안 for문돌려 끝내고 최대-최소 출력(?)
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int []arr = new int[101];
		int T = 10;
		for (int i = 1; i <=T; i++) {
			int dump = sc.nextInt();
			
			for (int j = 0; j < 100; j++) {
				arr[j] = sc.nextInt();
			}
			Arrays.sort(arr); // 오름차순
			
			for (int j = 0; j < dump; j++) {
				arr[0]++; arr[99]--;
				
				Arrays.sort(arr);
			}
			int result = arr[99] - arr[0];
//			System.out.println("dump: "+ dump);
			
			System.out.println("#" + i +" "+ result);
			
		}

		
	}

}
