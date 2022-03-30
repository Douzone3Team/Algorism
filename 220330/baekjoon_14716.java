package coding_220330;

import java.io.IOException;
import java.util.Scanner;

public class baekjoon_14716 {
	static int w, h;
	static int[][] word;
	static boolean[][] visited;

	// 12->3->6->9 //9시부터 시작이지만 90도 회전
	static int[] dx = { -1, -1, -1, 0, 0, 1, 1, 1 };
	static int[] dy = { -1, 0, 1, -1, 1, -1, 0, 1 };

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		w = sc.nextInt();
		h = sc.nextInt();

		word = new int[w][h];
		visited = new boolean[w][h];

		int cnt = 0;

		for (int i = 0; i < w; i++) { // 배열 word에 값 삽입
			for (int j = 0; j < h; j++) {
				word[i][j] = sc.nextInt();
			}
		} // word 값 삽입 종료

		for (int i = 0; i < w; i++) {
			for (int j = 0; j < h; j++) {
				// visited가 false=>방문안함 // word가 1 => 방문해야함
				if (!visited[i][j] && word[i][j] == 1) {
					cnt++;
					findWord(i, j);
				}
			}
		}

		System.out.println(cnt);
	}// main end

	static void findWord(int y, int x) {

		// 좌표값을 받은곳을 방문함 =>true
		visited[y][x] = true;

		for (int i = 0; i < 8; i++) {
			int ny = y + dy[i];
			int nx = x + dx[i];

			if (ny >= 0 && ny < w && nx >= 0 && nx < h) {
				if (word[ny][nx] == 1 && !visited[ny][nx]) {
					findWord(ny, nx);
				}
			}
		} // for end
	}// findword end

}
