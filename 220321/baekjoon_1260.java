package coding_220321;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//DFS�� BFS
//DFS : ���̿켱,�����κ��� �켱������ Ž�� , ���û�� 
//BFS : �ʺ�켱, ����� ������ �켱������ Ž��, ť���
public class baekjoon_1260 {
	
	static Scanner sc = new Scanner(System.in);
	static int N = sc.nextInt();
	static int M = sc.nextInt();
	static int V = sc.nextInt();
	
	public static boolean[] visited;
	static int [][] graph;
	
	public static void dfs(int start) {
		visited[start] = true;
		System.out.print(start + " ");
		for (int i = 1; i < N+1; i++) {
			if(graph[start][i] == 1 && !visited[i]) dfs(i);
		}
	}
	
	public static void bfs(int start) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(start);
		
		visited[start] = true;
		while(!q.isEmpty()) {
			int x = q.poll();
			System.out.print(x + " ");
			for (int i = 1; i < N+1; i++) {
				if(!visited[i] && graph[x][i] == 1) {
					q.offer(i);
					visited[i] = true;
				}
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
		dfs(V);
		
		System.out.println();
		visited = new boolean[N+1];
		bfs(V);
	}
}
