package coding_220330;

import java.io.IOException;
import java.util.Scanner;

public class baekjoon_14716 {
	static int w, h;
	static int[][] word;
	static boolean[][] visited;

	// 12->3->6->9 //9�ú��� ���������� 90�� ȸ��
	static int[] dx = { -1, -1, -1, 0, 0, 1, 1, 1 };
	static int[] dy = { -1, 0, 1, -1, 1, -1, 0, 1 };

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		w = sc.nextInt();
		h = sc.nextInt();

		word = new int[w][h];
		visited = new boolean[w][h];

		int cnt = 0;

		for (int i = 0; i < w; i++) { // �迭 word�� �� ����
			for (int j = 0; j < h; j++) {
				word[i][j] = sc.nextInt();
			}
		} // word �� ���� ����

		for (int i = 0; i < w; i++) {
			for (int j = 0; j < h; j++) {
				// visited�� false=>�湮���� // word�� 1 => �湮�ؾ���
				if (!visited[i][j] && word[i][j] == 1) {
					cnt++;
					findWord(i, j);
				}
			}
		}

		System.out.println(cnt);
	}// main end

	static void findWord(int y, int x) {

		// ��ǥ���� �������� �湮�� =>true
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
