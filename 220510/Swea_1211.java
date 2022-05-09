package algorithm_220510;

import java.util.Arrays;
import java.util.Scanner;

public class Swea_1211 {
	public static void main(String[] args) {
		final int Test = 10;
		Scanner sc = new Scanner(System.in);
		int[][] route;
		int x=0;
		for (int i = 0; i < Test; i++) {
			int n = sc.nextInt();
			route = new int[102][102];

			for (int j = 0; j < 102; j++) {
				Arrays.fill(route[j], 0);
			}

			for (int j = 1; j < 101; j++) {
				for (int k = 1; k < 101; k++) {
					route[j][k] = sc.nextInt();
				}
			}
			int min = Integer.MAX_VALUE;
			
			for (int j = 1; j < 101; j++) {
				if (route[1][j] == 1) {
					if(min>sumRoute(route,j)) {
						min = sumRoute(route,j);
						x = j;
					}
				}
			}
			System.out.println("#" + n + " " + (x-1));
		}
	}

	public static int sumRoute(int[][] arr, int start) {
		int startY = 1;
		int startX = start;
		int sum = 0;
		while (startY < 101) {
			if (arr[startY][startX + 1] == 1) { //
				while (arr[startY][startX + 1] != 0) {
					startX++;
					sum++;
				}
				startY++;
				sum++;
			} else if (arr[startY][startX - 1] == 1) {
				while (arr[startY][startX - 1] != 0) {
					startX--;
					sum++;
				}
				startY++;
				sum++;
			} else {
				startY++;
				sum++;
			}
		}
		return sum;
	}
}
