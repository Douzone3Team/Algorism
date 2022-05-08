package algorithm_220506;

import java.util.Scanner;

public class Swea_1209 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int Test = 10;
		int[][] numbers;

		for (int i = 0; i < Test; i++) {
			int n = sc.nextInt();
			numbers = new int[100][100]; // 2차원 배열 생성

			// 값 삽입
			for (int h = 0; h < 100; h++) {
				for (int w = 0; w < 100; w++) {
					numbers[h][w] = sc.nextInt();
				}
			}

			int sum, Wsum = 0, Hsum = 0;

			// 열의최대값
			for (int w = 0; w < 100; w++) {
				sum = 0;// sum 초기화
				for (int h = 0; h < 100; h++) {
					sum += numbers[h][w];
				}
				Hsum = Math.max(Hsum, sum);
			}

			

			// 행의 최대값 구하기
			for (int h = 0; h < 100; h++) {
				sum = 0;// sum 초기화
				for (int w = 0; w < 100; w++) {
					sum += numbers[h][w];
				}
				Wsum = Math.max(Wsum, sum);
			}

			sum = 0;// sum 초기화

			// 대각선 최대값
			int sum2=0;
			for (int h = 0; h < 100; h++) {
				sum += numbers[h][h];	// 1. 오른쪽 아래
				sum2 += numbers[h][99 - h];	// 2. 왼쪽 아래
			}
			
			int maxValue = Math.max(Hsum, Math.max(Wsum, Math.max(sum, sum2)));
			

			System.out.println("#" + n + " " + maxValue);
		}
	}
}
