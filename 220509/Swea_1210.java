package algorithm_220509;

import java.util.Arrays;
import java.util.Scanner;

public class Swea_1210 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int test = 10;
		int[][] route;
		for (int i = 0; i < test; i++) {
			int n = sc.nextInt();

			route = new int[102][102];
			
			for (int j = 0; j < 102; j++) {
				Arrays.fill(route[j], 0); // 사다리 초기화
			}
			for (int j = 1; j < 101; j++) {
				for (int k = 1; k < 101; k++) {
					route[j][k] = sc.nextInt();
				}
			}// 사다리 값 삽입
			
			int start=0;
			for (int j = 0; j < 102; j++) {
				if (route[100][j] == 2) {
					start = j;
					break;
				}
			}
			int sol = search(route,start)-1;
			System.out.println("#"+n+" " +sol);
		}//end test
	}//end main
	
	public static int search(int[][] arr,int start) {
		int startY=100;//사다리의 높이
		int startX=start;
		while(startY != 1) {//사다리의 높이가 1일때까지
			if(arr[startY][startX-1] == 1) { //왼쪽
				while(arr[startY][startX-1] != 0) {
					startX--;
				}
				startY--;
			}
			else if(arr[startY][startX+1] == 1) { //오른쪽
				while(arr[startY][startX+1] != 0) {
					startX++;
				}
				startY--;
			}
			else {
				startY--;
			}
		}//end while
		return startX;
	}//end search
}
