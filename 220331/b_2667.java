package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class b_2667 {
	static int[][] arr;
	static boolean[][] check;

	static int[] x = { -1, 1, 0, 0};
	static int[] y = { 0, 0, -1, 1};

	static int N;
	static int cnt = 0;
	static int house = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> list = new ArrayList<Integer>();

		N = Integer.parseInt(br.readLine());
		
		arr = new int[N][N];
		check = new boolean[N][N];
		
		for (int i = 0; i < N; i++) {
			String []str = br.readLine().split("");
			for (int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(str[j]);
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (!check[i][j] && arr[i][j] == 1) {
					house = 1;
					dfs(i, j);
					list.add(house);
					cnt++;
				}
			}
		}
		Collections.sort(list);
		System.out.println(cnt);
		
		for(Integer i : list) {
			System.out.println(i);
		}
		
		
	}

	public static void dfs(int a, int b) {
		check[a][b] = true;
		for (int i = 0; i < 4; i++) {
			int nx = a + x[i];
			int ny = b + y[i];
			
			if (0 <= nx && nx < N && 0 <= ny && ny < N && !check[nx][ny] && arr[nx][ny] == 1) {
				house++;
				dfs(nx, ny);
				
			}
		}
	}
}
