package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_14716 {
	static int[][] arr;
	static boolean[][] check;

	static int[] x = { -1, 1, 0, 0, -1, -1, 1, 1 };
	static int[] y = { 0, 0, -1, 1, 1, -1, -1, 1 };

	static int w, h;
	static int cnt = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;

		st = new StringTokenizer(br.readLine());
		w = Integer.parseInt(st.nextToken());
		h = Integer.parseInt(st.nextToken());

		arr = new int[w][h];
		check = new boolean[w][h];
		for (int i = 0; i < w; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < h; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		for (int i = 0; i < w; i++) {
			for (int j = 0; j < h; j++) {
				if (!check[i][j] && arr[i][j] == 1) {
					dfs(i, j);
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}

	public static void dfs(int a, int b) {
		check[a][b] = true;
		for (int i = 0; i < 8; i++) {
			int nx = a + x[i];
			int ny = b + y[i];
			
			if (0 <= nx && nx < w && 0 <= ny && ny < h && !check[nx][ny] && arr[nx][ny] == 1) {
				dfs(nx, ny);
			}
		}
	}
}