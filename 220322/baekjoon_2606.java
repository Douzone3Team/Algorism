package coding_220322;

import java.util.Scanner;

public class baekjoon_2606 {
	static Scanner sc = new Scanner(System.in);
	static int N = sc.nextInt();
	static int M = sc.nextInt();
	static int cnt = 0;
	public static boolean[] visited;
	static int [][] graph;
	
	public static void dfs(int start) {
		visited[start] = true;
		for (int i = 1; i < N+1; i++) {
			if(graph[start][i] == 1 && !visited[i]) {
				dfs(i);
				cnt++;
			}
		}
	}
	
	public static void main(String[] args) {
		graph = new int[N+1][N+1];
		for (int i = 0; i < M; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			graph[x][y] = 1;
			graph[y][x] = 1;
		}
		visited = new boolean[N+1];
		dfs(1);
		System.out.println(cnt);
	}
}
