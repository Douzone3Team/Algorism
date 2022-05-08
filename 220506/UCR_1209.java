package algorism;

import java.util.Scanner;

public class UCR_1209 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [][]arr = new int[100][100];
		
		for (int i = 1; i <= 10; i++) {
			
			for (int j = 0; j < 100; j++) {
				for (int k = 0; k < 100; k++) {
					arr[j][k] = sc.nextInt();
				}
			}
			int col_max = 0;
			int row_max = 0;
			// 행과 열 최대값
			for (int j = 0; j < 100; j++) {
				int col_sum = 0;
				int row_sum = 0;
				for (int k = 0; k < 100; k++) {
					col_sum += arr[j][k];
					row_sum += arr[k][j];
				}
				col_max = Math.max(col_max, col_sum);
				row_max = Math.max(row_max, row_sum);
			}
//			System.out.println("col_max: "+col_max+", row_max: "+row_max);
			
			// 양쪽 대각선 
			int diagonal1 = 0;
			int diagonal2 = 0;
			for (int j = 0; j < 100; j++) {
				diagonal1 += arr[j][j];
				diagonal2 += arr[j][99-j];
			}
			int dia_max = Math.max(diagonal1, diagonal2);
			
			int result = Math.max(dia_max, Math.max(col_max, row_max));
			System.out.println("#"+i+" "+result);
			
		}
	}

}
