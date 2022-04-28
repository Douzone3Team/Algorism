import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int board[][];
	static int n, min;
	static boolean visit[];

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk;
		n = Integer.parseInt(br.readLine());
		board = new int[n][n];
		visit = new boolean[n];
		min = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			stk = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < n; j++) {
				board[i][j] = Integer.parseInt(stk.nextToken());
			}
		}
		nCr(0, 0);
		System.out.println(min);
	}

// 재귀 호출로 조합 구현.
	public static void nCr(int start, int depth) {
		if (depth == n / 2) {
			min = Math.min(min, diff());
			return;
		}
		for (int i = start; i < n; i++) {
			if (!visit[i]) {
				visit[i] = true;
				nCr(i + 1, depth + 1);
				visit[i] = false;
			}
		}
	}

// 방문한 팀과 방문하지 않은 팀의 차이를 구한다.
	public static int diff() {
		int start = 0;// visit = true 면 start팀
		int link = 0; // visit = false 면 link팀
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (visit[i] && visit[j]) {
					start += board[i][j] + board[j][i];
				} else if (!visit[i] && !visit[j]) {
					link += board[i][j] + board[j][i];
				}
			}
		}
		return Math.abs(start - link);
	}
}
