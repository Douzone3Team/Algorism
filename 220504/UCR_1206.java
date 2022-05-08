package algorism;

import java.util.Scanner;

public class UCR_1206 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 10; i++) {
			
			int test = sc.nextInt();
			int []arr = new int[test];
			
			for (int j = 0; j < test; j++) {
				arr[j] = sc.nextInt();
			}
			
			int count = 0;
			for (int j = 2; j < test-2; j++) {
				int max = Math.max(arr[j-1], Math.max(arr[j-2], Math.max(arr[j+1], arr[j+2])));
				if(arr[j] > max) {
					count += arr[j] -max;
				}
			}
			System.out.println("#" + i + " " + count);
		}

	}

}
